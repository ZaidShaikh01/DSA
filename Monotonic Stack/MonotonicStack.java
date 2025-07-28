import java.util.*;
public class MonotonicStack {
    public static void main(String [] args){
        int [] arr = {2,5,3,4,7,8,1};
        int [] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.print(Arrays.toString(nge));
    }
}
