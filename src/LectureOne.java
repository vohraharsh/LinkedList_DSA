
class Node {

    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}

public class LectureOne {

    public static void main(String[] args) {

        Node h1 = new Node(2);
        Node h2 = new Node(7);
        Node h3 = new Node(15);
        Node h4 = new Node(8);

        h1.next = h2;
        h2.next = h3;
        h3.next = h4;

        printLinkedList(h1);
    }


    public static void printLinkedList(Node head){

        while (head != null){
            System.out.println(" " + head.data);
            head = head.next;
        }
        System.out.println();
    }
}