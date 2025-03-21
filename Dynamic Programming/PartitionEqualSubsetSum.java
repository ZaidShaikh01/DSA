import java.sql.Struct;

public class PartitionEqualSubsetSum {
        // Memoization apparoch
//    public static boolean canPartition(int[] nums) {
//        int totalSum=0;
//        for(int i =0;i<nums.length;i++){
//            totalSum+=nums[i];
//        }
//        Boolean[][] dp = new Boolean[nums.length][(totalSum / 2) + 1];
//
//
//        // Basically if the sum that we are getting when divided by 2 is not giving us the true value so, we return false if we get float value
//        // We have to check wheater the sum is float or integer
//
//        if (totalSum % 2 != 0) return false;
//
//        return helperIsPartition(nums,totalSum/2, nums.length-1,dp);
//
//    }
//
//    public static boolean helperIsPartition(int[] nums,int sum,int step,Boolean [][] dp){
//
//        // So the logic is that we have to find the subsequence which will give us half of the total sum...
//        // Another base condition is that if we get the value then we have to return true basically
//        if (sum == 0){
//            return true;
//        }
//        if(step < 0 || sum<0){
//            return false;
//        }
//
//        // Then we have to either take it or leave it
//        // If the nums[i] is exceeding the value of sum then we don't take it
//        if (dp[step][sum] != null){
//            return dp[step][sum];
//        }
//
//        // We are checking both we are taking and we are not taking and we are using OR operator to see what is right
//        boolean take = helperIsPartition(nums, sum-nums[step], step - 1,  dp);
//        boolean notTake = helperIsPartition(nums, sum, step - 1,  dp);
//        return dp[step][sum]=(take || notTake);
//
//
//
//
//    }

    // Tabulation apparoch
    public static boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i =0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        boolean[][] dp = new boolean[nums.length][(totalSum / 2) + 1];
        for (int i = 0; i <= nums.length; i++) dp[i][0] = true;
        if (totalSum % 2 != 0) return false;
        int target=totalSum/2;
        for (int i=1;i<nums.length;i++){
            for(int j=0;j<=target;j++){
                dp[i][j] = dp[i-1][j]; // This condition is for not taking the input

                if(j >= nums[i-1]){
                    dp[i][j] = dp[i][j] || dp[i-1][j - nums[i-1]];
                }

            }
        }
        return dp[nums.length][target];
    }

    public static void main(String[] args) {
        int [] arr ={1,5,11,5};
        System.out.println(canPartition(arr));

    }
}
