import java.util.*;
public class FinalPricesWithASpecialDiscountInAShop {
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int [] nle = new int [prices.length];
        for(int i = prices.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() >= prices[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nle[i] = 0;
            }
            else{
                nle[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return nle;
    }
}
