import java.util.Arrays;
import java.util.Queue;

public class MaxConsecutiveOnes3 {

    public static int longestOnes(int[] nums, int k) {

        int left=0;
        int right=0;
        int maxOnes=0;


        int zeroCount=0;
        while (right<nums.length){
            if (nums[right]==0){
                zeroCount++;
            }
            while (zeroCount>k){
                if (nums[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxOnes=Math.max(maxOnes,right-left+1);
            right++;
        }
        System.out.println(Arrays.toString(nums));
        return maxOnes;








    }

    public static void main(String[] args) {

        int [] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(arr,3));

    }
}
