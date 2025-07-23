import java.util.*;
public class EpicGame {
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {

            if(a > b) {

                a = a % b;
            }

            else {

                b = b % a;
            }
        }

        if(a == 0) {
            return b;
        }

        return a;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String [] str = sc.nextLine().trim().split(" ");
        int [] arr = new int[str.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int simon = arr[0];
        int antiSimon = arr[1];
        int heap = arr[2];
        int i = 0;
        int flag = 0;
        while(heap > 0){
            if(i == 0) {
                heap -= findGcd(simon, heap);
                i++;
                flag = 0;
            }
            else{
                heap -= findGcd(antiSimon, heap);
                i--;
                flag = 1;
            }
        }
        if(flag == 1){
            System.out.print(1);
        }
        else if (flag == 0){
            System.out.print(0);
        }


    }
}
