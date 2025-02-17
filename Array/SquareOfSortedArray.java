import java.util.Arrays;

public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
            // Brute approach
        for (int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int []  arr={-4,-1,0,3,10};
        sortedSquares(arr);
        System.out.println(Arrays.toString(arr));

    }

}
