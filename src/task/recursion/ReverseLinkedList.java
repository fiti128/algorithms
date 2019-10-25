package task.recursion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sergey Yanushevskiy
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        System.out.printf("Head %s, head next=%s,head.next.next=%s,  p %s%n", head, head.next,head.next.next, p);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public static void main(String[] args) {

        List<ListNode> list = IntStream.range(1, 9).mapToObj(ListNode::new).
                collect(Collectors.toList());
        for (int i = 0, len = list.size(); i < len -1; i++) {
            ListNode listNode = list.get(i);
            listNode.next = list.get(i+1);
        }
        list.get(0).printTree();
        new ReverseLinkedList().reverseList(list.get(0)).printTree();

    }
}
