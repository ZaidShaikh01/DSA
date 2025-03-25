import java.util.Arrays;

public class MinimalCost {

        // Memoization
//    public static int minimizeCost(int k, int arr[]) {
//        // If the array size is 0
//        if (arr.length == 1) return 0;
//        int [] dp = new int[arr.length];
//        Arrays.fill(dp,-1);
//        return recursiveMinCost(k,arr,arr.length-1,dp);
//        // code here
//    }
//    public static int recursiveMinCost(int k, int [] arr,int step,int [] dp){
//        if (dp[step]!=-1){
//            return dp[step];
//        }
//        if (step == 0){
//            return 0;
//        }
//        if (step==1){
//            return Math.abs(arr[1]-arr[0]);
//        }
//
//        int minimumCost = Integer.MAX_VALUE;
//        // Now What I'll do is iterate through the loop and take min of k
//        for (int i=1;i<= Math.min(k,step);i++){
//
//            int kStep = Math.abs(arr[step] - arr[step - i]) + recursiveMinCost(k,arr,step-i,dp);
//            minimumCost = Math.min(kStep,minimumCost);
//        }
//        return dp[step]=minimumCost;
//
//    }
    public static int minimizeCost(int k, int arr[]) {
        // If the array size is 0
        if (arr.length == 1) return 0;
        int [] dp = new int[arr.length];
        //Arrays.fill(dp,-1);
        // Here will be the base case
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);




        for (int i=2;i<arr.length;i++){
            int minCost = Integer.MAX_VALUE;
            for (int j=1;j<= Math.min(k,i);j++){
                int kStep = Math.abs(arr[i] - arr[i - j]) + dp[i-j];
                minCost = Math.min(kStep,minCost);
            }
            dp[i] = minCost;
        }
        return dp[dp.length-1];
        // code here
    }
    public static void main(String[] args) {
        int [] arr ={10, 30, 40, 50, 20};
        System.out.println(minimizeCost(3,arr));

    }
}
