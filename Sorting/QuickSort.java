import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int []arr,int low,int high){
        if(low<high) {
            int partitionIndex= helperSort(arr,low,high);

            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);

        }
    }

    public static int helperSort(int[]arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        // This loop will ensure that we are comparing element from pivot element till i & j are not passing each other

        while (i<j){
            // This two loops are there to increase the value of J till it find number smaller than pivot and I find number greater than Pivot element
            /// Both of this loops will run and look at the operators carefully
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }

        // This swap will occur when I & J are crossed, and we need to now change pivot with J value
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;

    }

    public static void main(String[] args) {

        int [] arr={2,35,15,3,2,23,67,11,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
