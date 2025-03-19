public class MinimumCostToReachTopFloor {

    public static int minCostClimbingStairs(int[] cost) {
        // First of all there are a lot of choices and I can see that backtracking is used So, Maybe lets start with backtracking
        // Or Better I will try just with recursion but the choices are made so...
        int n = cost.length;
        return Math.min(minCost(cost,n-1), minCost(cost,n-2));

    }
    public static int minCost(int [] cost, int step){
        // Base case
        if(step<0){
            return 0;
        }
        // Second one
        if (step == 1 || step == 0) return cost[step];
        return cost[step]+Math.min(minCost(cost,step - 1),minCost(cost,step-2));
    }

    public static void main(String[] args) {
        int [] cost ={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
