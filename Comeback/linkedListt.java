import com.sun.jdi.OpaqueFrameException;

import java.lang.classfile.constantpool.LongEntry;
import java.lang.runtime.TemplateRuntime;

class LinkedNodee {
    int data;
    LinkedNodee next;
    LinkedNodee(int data){
        this.data = data;
        this.next = null;
    }
}
public class linkedListt {
    LinkedNodee head;
    int length = 0;
    // Insert/ remove/ display/ Reverse List/ Sort List

    public void insert(int key){
        length++;
        LinkedNodee newNode = new LinkedNodee(key);
        if(head == null){
            head = newNode;

            return;

        }
        LinkedNodee temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        LinkedNodee temp = head;
        while(temp.next !=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // Reverse a list
    public void reverseList(){
        if(head == null){
            System.out.println("List is empty");
        }

        LinkedNodee prev = null;
        LinkedNodee next = head;
        LinkedNodee temp = next.next;
        while (temp != null){
            temp = next.next;
            next.next = prev;
            prev = next;
            next = temp;
        }
        head = prev;
    }

    // Sort a list
    public void sortList(){
//        LinkedNodee next =head.next;
        LinkedNodee temp = head;
//        LinkedNodee out = head;

        while (temp!=null){
            LinkedNodee next = temp.next;
            while (next!=null){
                if(temp.data < next.data){
                    int j = temp.data;
                    temp.data = next.data;
                    next.data = j;
                }
                next = next.next;
            }
            temp = temp.next;
        }
    }

    // Insert First/ Insert in the middle/ Length

    public int getLength(){
        return length;
    }

    public void insertFirst(int data){
        if(head == null){
            insert(data);
        }
        LinkedNodee nodee = new LinkedNodee(data);
        nodee.next = head;
        head = nodee;
    }

    public void insertAtIndex(int index, int data){
        if (index > length){
            System.out.println("Sorry that is out of bound, So, we have decided to add it at last place");
            insertFirst(data);
            return;
        }
        LinkedNodee nodee = new LinkedNodee(data);
        LinkedNodee temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;
        }
        nodee.next = temp.next;
        temp.next = nodee;

    }

    // Remove at index
    public void removeAtIndex(int index){
        if (index == 0){
            head = head.next;
            return;
        }
        LinkedNodee temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}

void main() {
    linkedListt linkList = new linkedListt();
    linkList.insert(100);
    linkList.insert(2);
    linkList.insert(31);
    linkList.insert(42);
    linkList.insert(55);
    linkList.display();
    linkList.reverseList();
    linkList.display();
    linkList.sortList();
    linkList.display();
    System.out.println("Length: " + linkList.getLength());
    linkList.insertFirst(98732419);
    linkList.display();
//    linkList.insert(98732419);
    linkList.insertAtIndex(3,9812);
    linkList.display();
    linkList.removeAtIndex(3);
    linkList.display();
    linkList.removeAtIndex(5);
    linkList.display();


}