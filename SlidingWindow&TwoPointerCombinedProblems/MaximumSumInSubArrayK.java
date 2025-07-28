public class MaximumSumInSubArrayK {
    public static double findMaxSum(int[] nums, int k) {

        int sum =0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String [] args){

    }
}
