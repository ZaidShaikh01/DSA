public class FrogJump {
    // Meimoization apparoch
//
//    public static int minCost(int[] height) {
//
//        int [] dp =  new int[height.length+1];
//        for (int i=0;i<dp.length;i++) dp[i] = -1;
//        return recursiveMinCost(height,height.length-1,dp);
//    }
//    public static int recursiveMinCost(int [] height, int step,int [] dp){
//
//        // First base case is if the step is less than 0 then I have to return
//        if(step==0){
//            return 0;
//        }
//        // If we are at the first or secound position the I have to return the value of that position
//        // If we are at secound step teh we can only come from first position
//        if ( step == 1){
//            return Math.abs(height[1]-height[0]);
//        }
//
//        // that subsequent array is already visited then we gonna reeturn the value
//        if(dp[step] != -1){
//            return dp[step];
//        }
//
//        // to take either one step or two step
//        int oneStep = Math.abs(height[step] - height[step-1]) + recursiveMinCost(height,step-1,dp);
//        int twoStep = Math.abs(height[step]-height[step-2]) + recursiveMinCost(height,step-2,dp);
//
//        // Now I have to return the cost
//        return dp[step]=Math.min(oneStep,twoStep);
//    }

    // Tabuation apparoch

//    public static int minCost(int[] height) {
//
//        int [] dp =  new int[height.length];
//        // The base cases
//        dp[0] = 0;
//        dp[1] = Math.abs(height[1]-height[0]);
//
//        for (int i = 2 ; i < dp.length;i++){
//            int oneStep =Math.abs(height[i] - height[i-1]) + dp[i-1];
//            int twoStep = Math.abs(height[i]-height[i-2]) + dp[i-2];
//            dp[i]=Math.min(oneStep,twoStep);
//        }
//
//
//
//        return dp[dp.length-1];
//
//    }

    public static int minCost(int[] height) {


        // The base cases
        int prev2 = 0;
        int prev = 0;
        if (height.length>1) {
            prev = Math.abs(height[1] - height[0]);
        }

        for (int i = 2 ; i < height.length;i++){
            int oneStep =Math.abs(height[i] - height[i-1]) + prev;
            int twoStep = Math.abs(height[i]-height[i-2]) + prev2;
            prev2 = prev;
            prev=Math.min(oneStep,twoStep);
        }



        return prev;

    }


    public static void main(String[] args) {
        int [] arr = {20, 30, 40, 20};
        System.out.println(minCost(arr));

    }
}
