import java.net.SocketImpl;
import java.util.Arrays;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;

    public Queue(){
        queue = new int[5];
        front = -1;
        rear = -1;
        System.out.println("Queue initialized!");
    }
//    Methods to implement: Enqueue, Dequeue, Peek, isEmpty, Length

    public void enqueue(int num){
        if (front == queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        else {
            if(rear == -1){
                rear=0;
            }
            front++;
            queue[front] = num;


        }
    }
    public int dequeue(){
        if(rear == -1 || rear > front){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        else{
            return queue[rear++];

        }
    }
    public int peek(){
        if(rear == -1 || rear > front){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return queue[rear];
    }

    @Override
    public String toString() {
        return STR."Queue{queue=\{Arrays.toString(queue)}, front=\{front}, rear=\{rear}}";
    }
}

void main() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    System.out.println(queue);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.peek());
    System.out.println(queue.dequeue());
//    System.out.println(queue.dequeue());
//    System.out.println(queue.dequeue());
//    queue.enqueue(5);


}
