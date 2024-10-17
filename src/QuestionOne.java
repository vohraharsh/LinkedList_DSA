class ListNode {
    
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class QuestionOne {


    public static ListNode ReverseLinkedList (ListNode head){

        ListNode prev = null;
        ListNode temp = head;
        ListNode next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;

            prev = temp;
            temp = next;
        }

        head = prev;
        return head;
    }

    public static void printLinkedList(ListNode head){

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        /*
            1. Reverse a Linked List
            Test Case 1:

            Input: 1 -> 2 -> 3 -> 4 -> 5
            Expected Output: 5 -> 4 -> 3 -> 2 -> 1
            Test Case 2:

            Input: 1 -> 2
            Expected Output: 2 -> 1
            Test Case 3:

            Input: None (empty list)
            Expected Output: None

         */

         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(3);
         head.next.next.next = new ListNode(4);
         head.next.next.next.next = new ListNode(5);


         head = ReverseLinkedList(head);
         printLinkedList(head);
    }
    
}
