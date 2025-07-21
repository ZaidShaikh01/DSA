import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int [] arr){

        for (int i= arr.length-1;i>=0;i--){
            int didSwap=0;
            for (int j=0;j<=i;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    didSwap=1;
                }

            }
            if (didSwap==0){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int [ ] arr = {1,2,5,7,6,9,4,8,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
