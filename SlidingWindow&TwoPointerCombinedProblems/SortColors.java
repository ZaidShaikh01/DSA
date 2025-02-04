import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {

    public static void sortColors(int [] arr){
        mergeSort(arr,0,arr.length-1);



    }
    private static void mergeSort(int[] arr, int low, int  high) {
        // Base condition to return from recursion
        if(low>=high){
            return;
        }

        int midIndex=(low+high)/2;
        /// Below codes are written to divide the array in smaller arrays & this will like kind of do dividation of array until they are in unit

        mergeSort(arr,low,midIndex);

        mergeSort(arr,midIndex+1,high);

        merge(arr,low,midIndex,high);




    }
    private static void merge(int  []arr, int low,int mid, int high){
        // Dividing the array into left and right
        int left=low;
        int right=mid+1;
        // You also need an temporary array to store the sorted values
        ArrayList<Integer> temp=new ArrayList<>();
        // The below array is like sorting the array and putting the variables in the temp
        while(left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        // We use this 2 while loops to check if any elements are remaining if not then just throw the elements man ;>

        while (left<=mid){
            temp.add(arr[left]);
            left++;

        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }

        // Now we copy the elements in the original array
        for (int i=0;i<temp.size();i++){
            arr[low+i]= temp.get(i);
        }

    }
    public static void main(String[] args) {
        int [] arr={2,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
}
