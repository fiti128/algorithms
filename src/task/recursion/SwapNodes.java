package task.recursion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Sergey Yanushevskiy
 */
public class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null ) {
            return head;
        }
        ListNode tmp = head;
        head = head.next;
        head.next = tmp;
        swapPairs(tmp.next.next);
        // if (head.next.next != null) {
        //
        // }
        return head;
    }

    public static void main(String[] args) {

        List<ListNode> list = IntStream.range(1, 5).mapToObj(ListNode::new).
                collect(Collectors.toList());
        for (int i = 0, len = list.size(); i < len -1; i++) {
            ListNode listNode = list.get(i);
            listNode.next = list.get(i+1);
        }
        System.out.println(list.get(0));
        System.out.println("-----");
        new SwapNodes().swapPairs(list.get(0)).printTree();

    }

}
