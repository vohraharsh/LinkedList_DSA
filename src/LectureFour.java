class Node4 {

    int data; 
    Node4 next;
    Node4 prev;

    Node4(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class LectureFour {
    
    public static void main(String[] args) {

        int arr[] = {2,5,6,7,9,3};

        //Node4 head = convertArrayTODLL(arr);
        
        Node4 head = new Node4(6);
        head.next = new Node4(7);
        head.next.next = new Node4(5);
        head.next.next.next = new Node4(9);
        
        printDll(head);

        head = deleteAtHead(head);
        System.out.println();
        printDll(head);
        
    }

    private static void printDll(Node4 head){
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    private static Node4 convertArrayTODLL(int arr[]){

        Node4 head = new Node4(arr[0]);

        Node4 prev = head;

        for(int i=1; i<arr.length; i++){
            Node4 temp = new Node4(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static Node4 deleteAtHead(Node4 head){

        if(head == null || head.next == null){
            return null;
        }

        Node4 prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;
    }
}
