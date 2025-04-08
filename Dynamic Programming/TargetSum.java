public class TargetSum {
//    public static int findTargetSumWays(int[] nums, int target) {
//
//        int totalSum=0;
//        for (int i=0;i<nums.length;i++) totalSum +=nums[i];
//
//        if (totalSum < target || (totalSum + target) % 2 != 0) return 0; // If the element is odd one then we are going to return 0 'Cuz we can't find the partition then
//
//        int [][]dp= new int[nums.length][target+1];
//        int localTarget = (totalSum + target) / 2;
//
//        for (int i=0;i< nums.length;i++){
//            for (int j=0;j<target+1;j++){
//                dp[i][j]=-1;
//            }
//        }
//        return recursiveFindTargetSum(nums,nums.length-1,localTarget,dp);
//
//
//    }
//
//    public static int recursiveFindTargetSum(int [] nums , int index, int target,int [][] dp){
//        // If the index is zero
//        if (index == 0){
//            if(target == 0 || index == target) return 1;
//            if (target == 0 && nums[0]==0) return 2;
//            return 0;
//        }
//        if(dp[index][target]!=-1){
//            return dp[index][target];
//        }
//        int notTake = recursiveFindTargetSum(nums,index-1,target,dp);
//        int take=0;
//        if(nums[index]<=target){
//            take = recursiveFindTargetSum(nums,index-1,target-nums[index],dp);
//        }
//        return dp[index][target]=(take + notTake);
//    }

    public static int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        if (totalSum < target || (target + totalSum) % 2 != 0) return 0;

        int subsetTarget = (target + totalSum) / 2;
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[nums.length][subsetTarget + 1];

        // Base case
        if (nums[0] == 0) {
            dp[0][0] = 2; // pick and not pick
        } else {
            dp[0][0] = 1; // not pick
            if (nums[0] <= subsetTarget)
                dp[0][nums[0]] = 1; // pick
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= subsetTarget; j++) {
                int notTake = dp[i - 1][j];
                int take = 0;
                if (nums[i] <= j)
                    take = dp[i - 1][j - nums[i]];
                dp[i][j] = (take + notTake) % mod;
            }
        }

        return dp[nums.length - 1][subsetTarget];
    }

    public static void main(String[] args) {

    }
}
