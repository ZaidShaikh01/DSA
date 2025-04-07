public class PartitionArrayIntoTwoArraystoMinimizeSumDifference {

    public static int minimumDifference(int[] nums) {
        int n=nums.length;
        int totalSum=0;

        for (int i=0;i<nums.length;i++) totalSum+=nums[i];
        // Now we are going to do the subsetSum
        boolean dp[][]=new boolean[nums.length][totalSum+1];
        // Writing the base cases
        for(int i=0;i<n;i++) dp[i][0]=true;
        // Second base case is for that one target element
        if (nums[0]<=totalSum) dp[0][nums[0]] = true;
        // As there are two changing parameters we use two nested loops
        for (int ind = 1; ind <n; ind++){
            // Changing the index
            for (int target = 1; target <=totalSum; target++){
                // Looking for the taget
                boolean notTake = dp[ind -1][target];
                boolean take=false;
                if (nums[ind]<=target){
                    take=dp[ind -1][target-nums[ind]];
                }
                dp[ind][target]= take || notTake;
            }
        }
        // We have got the dp table now further solving the sum
        // So the logic here is that if we can get s1 then we can get s2 by simply subtracting totalsum by s1
        // And the values of s1 lies between 0 & totalSum
        // And that we can get using the dp table
        // We have optimised this code by running loop only halves time
        int mini = (int) 1e9;
        for (int s1 = 0; s1 <=totalSum/2; s1++){
            if (dp[n-1][s1] == true){
                mini = Math.min(mini, Math.abs((totalSum - s1)-s1));
            }
        }
        return mini;

    }

    public static void main(String[] args) {

    }
}
