public class PerfectSumProblem {

    static int mod = (int)1e9 + 7;

    public static int perfectSum(int[] nums, int target) {
        // code here
        int [][]dp= new int[nums.length][target+1];

        for (int i=0;i< nums.length;i++){
            for (int j=0;j<target+1;j++){
                dp[i][j]=-1;
            }
        }
        return recursivePerfectSum(nums, nums.length-1,target,dp);

    }

    public static int recursivePerfectSum(int[] nums,int index,int target,int[][]dp){
        // So, At base case we have to increase the value of count
        if (index == 0) {
            if (target == 0 && nums[0] == 0) return 2; // pick or not pick zero
            if (target == 0 || nums[0] == target) return 1;
            return 0;
        }
        if (dp[index][target]!=-1){
            return dp[index][target];
        }

        int notTake= recursivePerfectSum(nums,index-1,target,dp) % mod;
        int take=0;
        if (nums[index] <= target){
            take=recursivePerfectSum(nums,index-1,target-nums[index],dp) % mod;
        }


        return dp[index][target]= (take+notTake) % mod;

    }

    public static void main(String[] args) {

    }
}
