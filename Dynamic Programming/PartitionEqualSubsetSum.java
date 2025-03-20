import java.sql.Struct;

public class PartitionEqualSubsetSum {

    public static boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int i =0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        Boolean[][] dp = new Boolean[nums.length][(totalSum / 2) + 1];
        dp[0][0]=true;

        // Basically if the sum that we are getting when divided by 2 is not giving us the true value so, we return false if we get float value
        // We have to check wheater the sum is float or integer

        if (totalSum % 2 != 0) return false;

        return helperIsPartition(nums,totalSum/2, nums.length-1,0,dp);

    }

    public static boolean helperIsPartition(int[] nums,int sum,int step,int currSum,Boolean [][] dp){

        // So the logic is that we have to find the subsequence which will give us half of the total sum...
        // Another base condition is that if we get the value then we have to return true basically
        if (sum == currSum){
            return true;
        }
        if(step < 0 || currSum>sum){
            return false;
        }

        // Then we have to either take it or leave it
        // If the nums[i] is exceeding the value of sum then we don't take it
        if (dp[step][currSum] != null){
            return dp[step][currSum];
        }

        // We are checking both we are taking and we are not taking and we are using OR operator to see what is right
        boolean take = helperIsPartition(nums, sum, step - 1, currSum + nums[step],  dp);
        boolean notTake = helperIsPartition(nums, sum, step - 1, currSum,  dp);
        return dp[step][currSum]=(take || notTake);




    }

    public static void main(String[] args) {
        int [] arr ={1,5,11,5};
        System.out.println(canPartition(arr));

    }
}
