class Node3 {

    int data;
    Node3 next;

    Node3(int data){
        this.data = data;
        this.next = null;
    }
}

public class LectureThree {
    
    public static void main(String[] args) {

        int k = 1;
        int val = 90;

        Node3 h1 = new Node3(4);
        Node3 h2 = new Node3(6);
        Node3 h3 = new Node3(5);

        h1.next = h2;
        h2.next = h3;

        printLL(h1);
        
        //h1 = deleteHead(h1);
        //h1 = deleteTail(h1);
        //h1 = removeKNode(h1, k);

        //h1 = insertAtHead(h1, k);
        //h1 = insertAtTail(h1, k);
        h1 = insertAtK(h1, k, val);
        printLL(h1);
    }

    private static Node3 deleteHead(Node3 h1 ){
        //Edge Case - If LL is empty
        if(h1 == null){
            return h1;
        }
        h1 = h1.next;
        return h1;
    }

    private static void printLL(Node3 h1){
        Node3 temp = h1;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node3 deleteTail(Node3 h1){

        //Edge Case - If LL is Empty or contains only single node
        if(h1 == null || h1.next == null){
            return null;
        }
        Node3 temp = h1;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return h1;
    }

    private static Node3 removeKNode(Node3 h1, int k){

        if(h1 == null){
            return h1;
        }

        if(k == 1){
            h1 = h1.next;
            return h1;
        }

        Node3 temp = h1;
        Node3 prev = null;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return h1;
    }

    private static Node3 insertAtHead(Node3 h1, int k){
        Node3 temp = new Node3(k);
        temp.next = h1;
        return temp;
    }

    private static Node3 insertAtTail(Node3 h1, int k){

        if(h1 == null){
            return new Node3(k);
        }

        Node3 temp = h1;

        while(temp.next != null){
            temp = temp.next;
        }
        Node3 newNode = new Node3(k);
        temp.next = newNode;
        return h1;
    }

    private static Node3 insertAtK(Node3 h1, int k, int val){
        Node3 temp = new Node3(val);
        if(h1 == null){
            if(k==1){
                temp.next = h1;
                return temp;
            } else {
                return h1;
            }
        }
        if(k==1){
            temp.next = h1;
            return temp;
        }

        int count = 0;
        Node3 mover = h1;
        while(mover != null){
            count++;
            if(count == k-1){
                temp.next = mover.next;
                mover.next = temp;
                break;
            }
            mover = mover.next;
        }
        return h1;
    }
}
