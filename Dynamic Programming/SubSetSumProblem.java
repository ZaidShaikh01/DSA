public class SubSetSumProblem {
    // Meimoization
//    public static Boolean isSubsetSum(int arr[], int sum) {
//        // code here
//
//        // Now memoizing it
//
//        Boolean dp[][] =new Boolean[arr.length+1][sum+1];
//        return recursvieSubsetSum(arr,arr.length-1,sum,dp);
//    }
//
//    public static boolean recursvieSubsetSum(int [] arr,int index,int target, Boolean dp [][]){
//        // First always write base cases
//
//        // First base is that we have found the target
//        if (target == 0) return true;
//
//        // Secound is that at last element we have found the target
//        if (index == 0 && target == arr[index]) return true;
//
//        // Third is that we have not found it
//        if (index < 0) return false;
//
//        // For meimoizing it
//        if (dp[index][target]!= null){
//            return dp[index][target];
//        }
//        // Then, two choices to take or not take
//
//        boolean notTake = recursvieSubsetSum(arr,index-1,target,dp);
//        boolean take = false;
//        // At any point target is smaller than the arr[index] we need to not check so,
//        if (target >= arr[index]){
//            take = recursvieSubsetSum(arr,index-1,target-arr[index],dp);
//        }
//
//        return dp[index][target]=take || notTake;
//
//
//    }
 // Tabulation apparoch
    public static Boolean isSubsetSum(int arr[], int sum) {
        boolean [][] dp = new boolean[arr.length+1][sum+1];

        //  Writing the base cases
        for (int i =0;i<arr.length;i++) dp[i][0] = true;
        // If first element is within sum, mark it
        if (arr[0] <= sum) dp[0][arr[0]] = true;
        for (int i =1;i< arr.length;i++){
            for (int j=1;j<=sum;j++){
                boolean notTake = dp[i-1][j];
                boolean take = false;
                if (arr[i]<=j) take= dp[i-1][j-arr[i]];
                dp[i][j]= take || notTake;
            }
        }
        return dp[arr.length][sum];
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        System.out.println(isSubsetSum(arr,6));
    }
}
