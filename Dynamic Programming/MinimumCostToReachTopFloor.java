import java.util.Arrays;

public class MinimumCostToReachTopFloor {

    public static int minCostClimbingStairs(int[] cost) {
        // First of all there are a lot of choices and I can see that backtracking is used So, Maybe lets start with backtracking
        // Or Better I will try just with recursion but the choices are made so...


        int n = cost.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);



        return Math.min(minCost(cost,n-1,dp), minCost(cost,n-2,dp));

    }
    public static int minCost(int [] cost, int step, int [] dp){
        // Base case
        if(step<0){
            return 0;
        }
        // Second one
        if (step == 1 || step == 0) return cost[step];
        // Cheking the dp array
        if (dp[step]!=-1){
            return dp[step];
        }

        return dp[step]=cost[step]+Math.min(minCost(cost,step - 1,dp),minCost(cost,step-2,dp));
    }

    public static void main(String[] args) {
        int [] cost ={1,100,1,1,1,100,1,1,100,1};

        System.out.println(minCostClimbingStairs(cost));
    }
}
