import java.util.Arrays;

public class LeftRotateByD {
    public static void leftRotateByD(int[]arr,int D) {
        int j = 1;
        while (j <= D) {


            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            j++;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        leftRotateByD(arr,8);
        System.out.println(Arrays.toString(arr));

    }
}
