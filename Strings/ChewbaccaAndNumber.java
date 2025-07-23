import java.util.*;
public class ChewbaccaAndNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<n.length();i++){
            int digit = n.charAt(i) - '0';
            int inverted = 9 - digit;
            if (i == 0 && inverted == 0) {
                str.append(digit);
            } else {
                str.append(Math.min(digit, inverted));
            }

        }
        if(n.length() == 1) System.out.print(n);
        else System.out.print(str);

    }
}
