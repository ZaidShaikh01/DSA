public class FrogJump {

    public static int minCost(int[] height) {

        int [] dp =  new int[height.length+1];
        for (int i=0;i<dp.length;i++) dp[i] = -1;
        return recursiveMinCost(height,height.length-1,dp);
    }
    public static int recursiveMinCost(int [] height, int step,int [] dp){

        // First base case is if the step is less than 0 then I have to return
        if(step==0){
            return 0;
        }
        // If we are at the first or secound position the I have to return the value of that position
        // If we are at secound step teh we can only come from first position
        if ( step == 1){
            return Math.abs(height[1]-height[0]);
        }

        // that subsequent array is already visited then we gonna reeturn the value
        if(dp[step] != -1){
            return dp[step];
        }

        // to take either one step or two step
        int oneStep = Math.abs(height[step] - height[step-1]) + recursiveMinCost(height,step-1,dp);
        int twoStep = Math.abs(height[step]-height[step-2]) + recursiveMinCost(height,step-2,dp);

        // Now I have to return the cost
        return dp[step]=Math.min(oneStep,twoStep);
    }


    public static void main(String[] args) {
        int [] arr = {20, 30, 40, 20};
        System.out.println(minCost(arr));

    }
}
