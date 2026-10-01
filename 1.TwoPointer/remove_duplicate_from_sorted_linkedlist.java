public class remove_duplicate_from_sorted_linkedlist {
    

    // Linked List Node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            if (current.val == current.next.val) {
                current.next = current.next.next;
            } 
            else {
                current = current.next;
            }
        }

        return head;
    }

    // Main method
    public static void main(String[] args) {

        // 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        remove_duplicate_from_sorted_linkedlist obj = new remove_duplicate_from_sorted_linkedlist();

        head = obj.deleteDuplicates(head);

        // Print linked list
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
    

