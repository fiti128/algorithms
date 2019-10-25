package task.recursion;

/**
 * @author Sergey Yanushevskiy
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
    public void printTree() {
        ListNode head = this;
        while (head != null) {
            System.out.print(head + ",");
            head = head.next;
        }
    }
    @Override
    public String toString() {
        return "val=" + val;
    }
}
