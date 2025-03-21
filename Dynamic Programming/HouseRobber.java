import java.util.Arrays;

public class HouseRobber {
        // Memoization
//    public static int rob(int[] nums) {
//        //System.out.println(recursiveRob(nums,nums.length-2,0));
//       // System.out.println(recursiveRob(nums,nums.length-2,0));
//        //System.out.println();
//
//        int [] dp = new int[nums.length+1];
//        Arrays.fill(dp,-1);
//        return recursiveRob(nums,nums.length-1,dp) ;
//
//
//
//    }
//
//    public static int recursiveRob(int [] nums,int step,int [] dp){
//
//        // So, The base condition for if we start from n-1 is 0
//        // & if we start from n-2 is 1
//
//        // This condition is wrong
//        if(step < 0 ){
//            return 0;
//        }
//        // If exists in dp then return
//        if (dp[step] != -1){
//            return dp[step];
//        }
//
//        int take= nums[step] + recursiveRob(nums,step-2,dp);
//        int skip= recursiveRob(nums,step-1,dp);
//
//
//
//
//        return dp[step]=Math.max(take,skip);
//    }

    public static int rob(int[] nums){
    // Edge case

        if(nums.length == 1) return nums[0];
        int [] dp = new int[nums.length];


        dp[0]=nums[0]; // If there is only one house it will give 0
        dp[1]= Math.max(nums[0],nums[1]);
        for (int i=2;i< nums.length;i++){

            dp[i] = Math.max(dp[i-1],nums[i]+dp[i-2]);

        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
