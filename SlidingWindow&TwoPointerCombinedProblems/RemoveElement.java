import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums,int val){


        int left = 0;  // Pointer to track the position of non-val elements

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;

    }
    public static void main(String[] args) {
        int [] arr ={3,3};
        System.out.println(removeElement(arr,3));
        System.out.println(Arrays.toString(arr));
    }
}
