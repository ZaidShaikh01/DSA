import java.util.Stack;

public class ValidParenthesis {

    public static boolean validString(String arr) {
        Stack<Character> stack=new Stack<>();
        char currentChar;
        boolean isStackUsed =false;
        if (arr.length()%2!=0){
            return false;
        }

        for (int i=0;i<arr.length();i++){
            currentChar = arr.charAt(i);
            if (currentChar=='[' || currentChar=='{' || currentChar==('(')){
                stack.push(currentChar);
                isStackUsed =true;
            }
            else if (!stack.isEmpty() && currentChar ==']' && stack.peek()=='['){
                stack.pop();
            }
            else if (!stack.isEmpty() && currentChar =='}' && stack.peek()=='{'){
                stack.pop();
            }
            else if (!stack.isEmpty() && currentChar ==')' && stack.peek()=='('){
                stack.pop();
            }
            else {
                isStackUsed =false;
                break;
            }

        }
        if (stack.isEmpty() && isStackUsed){
            System.out.println("Stack is empty");
            return true;
        }

        return false;

    }
    public static void main(String[] args) {

        String s= "{)}(";

        boolean isValid=validString(s);
        System.out.println(isValid);



    }
}
