import java.util.*;

public static class Stack {
    private int[] array;
    private int count;

    Stack() {
        array = new int[5];
        count = -1;
    }

    //    Push method
    public void push(int num) {
//        Checking overflow
        if (array.length < count+1) {
            System.out.println("Stack Overflow!!");
            return;
        }

        System.out.println(count);
        array[++count] = num;
    }

    // Pop method
    public int pop() {
       if(isEmpty()){
           return -1;
       }
        else {
            return array[count--];
        }
    }
    public int peek(){
        if (isEmpty()){
            return -1;
        }
        return array[count];
    }
    public boolean isEmpty(){
        if (count == -1) {
            return true;
        }
        return false;
    }
    public int length(){
        return count+1;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return STR."Stack{array=\{Arrays.toString(array)}, count=\{count+1}}";
    }
}


public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.length());
    System.out.println(stack.isEmpty());
//    stack.pop();
    System.out.println(stack);
//    stack.push(1);
}