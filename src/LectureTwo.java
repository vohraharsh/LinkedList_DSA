
class Node2 {

    int data;
    Node2 next;

    Node2 (int data){
        this.data = data;
        this.next = null;
    }
}

public class LectureTwo {
    
    public static void main(String[] args) {

        int arr[] = {2,3,1,8};

        Node2 head = convertArrayToLinkedList(arr);
        System.out.println(head.data);
    }


    private static Node2 convertArrayToLinkedList(int arr[]){
    
        Node2 head = new Node2(arr[0]);
    
        Node2 mover = head;
    
        for(int i=1; i<arr.length; i++){
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
