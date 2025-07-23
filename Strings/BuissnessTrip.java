import java.util.*;
public class BuissnessTrip {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count =0;
        int sum = 0;
        sc.nextLine();
        String [] str = sc.nextLine().trim().split(" ");
        int [] arr = new int[str.length];
        for(int i =0;i<str.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int i = arr.length-1;
        while(i >= 0){
            if( sum < k){
                sum += arr[i];
                count ++;

            }
            i--;
        }
        if(sum >= k) System.out.print(count);
        else if(sum < k) System.out.print(-1);
    }
}
