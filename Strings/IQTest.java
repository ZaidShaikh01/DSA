import java.util.*;
public class IQTest {
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        sc.nextLine();
        String [] str = sc.nextLine().trim().split(" ");
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int evenNum=0;
        int oddNum=0;
        for(int i = 0;i<n;i++){
            if(isEven(arr[i])) evenNum++;
            else oddNum++;
        }
        int index = 0;
        if(oddNum>evenNum){
            for(int i = 0;i<n;i++){
                if(isEven(arr[i])) index = i; break;

            }
        }
        else{
            for(int i = 0;i<n;i++){
                if(!isEven(arr[i])) index = i; break;

            }
        }
        System.out.print(index+1);
    }
}
