class LinkNode {
    int data;
    LinkNode next;

    LinkNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    LinkNode head;


    public void insert(int key) {
        LinkNode newNode = new LinkNode(key);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }


    public void display() {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void reverseList(){
        LinkNode current = head;
        LinkNode prev = null;
        LinkNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }
    public void sortList(){
        // Sorthing the list compare the current with the other elements
        // pick the first number then itreate the keys, use bubble sort I guess
        LinkNode current = head;
        LinkNode next = null;
        while(current != null){
            next = current.next;
            while(next != null){
                if(next.data > current.data){
                    int temp = next.data;
                    next.data =  current.data;
                    current.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(50);
        list.insert(20);
        list.insert(70);
        list.insert(30);
        list.reverseList();
        list.sortList();
        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
