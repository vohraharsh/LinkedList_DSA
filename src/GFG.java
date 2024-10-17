class practice {

    int data;
    practice next;
    practice prev;

    practice (int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class GFG {
    
    public static void main(String[] args) {
        

        // Q1 -> Print LL Elements

        /*  Input: LinkedList : 1 -> 2
         *  Output: 1 2
            Explanation: The linked list contains two elements 1 and 2.The elements are printed in a single line.
         */

         practice head = new practice(1);
         head.next = new practice(2);

         printLinkedListElements(head);


    }

    public static void printLinkedListElements(practice head){

        practice temp;
        temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
