import java.util.Arrays;

public class RightRotateByD {
    public static void rightRotateByD(int[]arr, int D) {
        D=D% arr.length;
        // Trying reversing the arrays

        // First reversing the whole array
        reverseArray(arr,0, arr.length-1);
        // Now reversing the starting D elements
        reverseArray(arr,0,D-1);
        // NOw reversing the whole array
        reverseArray(arr,D,arr.length-1);


    }
    public static void reverseArray(int [] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        rightRotateByD(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
