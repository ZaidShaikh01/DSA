import java.util.*;
public class BitLanguage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int noOfStatement = sc.nextInt();
        String [] str = new String[noOfStatement];
        for(int i =0;i<noOfStatement;i++){
            str[i] = sc.next();
        }
        int x = 0;
        for(int i =0;i<noOfStatement;i++){
            if(Objects.equals(str[i], "++X")){
                ++x;
            }
            else if(Objects.equals(str[i], "X++")){
                x++;
            }
            else if(Objects.equals(str[i], "X--")){
                x--;
            }
            else if(Objects.equals(str[i], "--X")){
                --x;
            }
        }
        System.out.print(x);
    }
}
