import java.util.*;
public class ILoveUserMan {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        String [] str = sc.nextLine().trim().split(" ");
        int [] arr = new int[input];
        int count=0;
        int maxElement;
        int minElement;
        for(int i = 0;i<input;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        minElement = maxElement = arr[0];
        for(int i = 1;i<input;i++){
            if(arr[i] < minElement){
                minElement = arr[i];
                count++;
            }
            else if(arr[i] > maxElement){
                maxElement = arr[i];
                count++;
            }
        }
        System.out.print(count);
    }
}
