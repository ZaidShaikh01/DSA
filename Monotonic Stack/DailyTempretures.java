import java.util.*;
public class DailyTempretures {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] ans = new int [temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = temperatures.length-1; i>=0;i--){
            while(!stack.isEmpty() && stack.peek() >= temperatures[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] =stack.peek();
            }
            stack.push(temperatures[i]);
        }
        return ans;
    }
}
