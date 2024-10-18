class ListNode2 {
    int data;
    ListNode2 next;

    ListNode2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QuestionTwo {

    //Helper Method - To print the Linked List
    public static void printLinkedList(ListNode2 head) {
        ListNode2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Helper Method - To Get the Kth Element
    public static ListNode2 KthNode(ListNode2 head, int k){

        ListNode2 temp = head;
        while (temp != null && k > 1) {
            k--;
            temp = temp.next;
        }
        return temp;
    }


    public static ListNode2 ReverseLinkedListWithK(ListNode2 head, int k){

        ListNode2 temp = head;
        ListNode2 prev = null;
        ListNode2 nHead = null;

        while (temp != null){
            ListNode2 getKthNode = KthNode(temp, k);
                if(getKthNode == null){
                    if (prev != null) prev.next = temp;
                    break;
                }

                ListNode2 nextNode = getKthNode.next;

                getKthNode.next = null; 

                ListNode2 reverseLL = ReverseLinkedList(temp);

                if(nHead == null){
                    nHead = reverseLL;
                } else {
                    prev.next = reverseLL;
                }

                prev = temp;
                temp = nextNode;
            }
        return nHead;
    }

    //Helper Method - To reverse Linked List - Segment of Linked List
    private static ListNode2 ReverseLinkedList(ListNode2 head) {

        ListNode2 prev = null;
        ListNode2 curr = head;

        while (curr != null) {
            ListNode2 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Test case 1
        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(3);
        head.next.next.next = new ListNode2(4);
        head.next.next.next.next = new ListNode2(5);
        head.next.next.next.next.next = new ListNode2(6);
        head.next.next.next.next.next.next = new ListNode2(7);
        head.next.next.next.next.next.next.next = new ListNode2(8);

        int k = 3;

        System.out.println("Input List:");
        printLinkedList(head);

        head = ReverseLinkedListWithK(head, k);
        System.out.println("Reversed List");
        printLinkedList(head);
    }
}
