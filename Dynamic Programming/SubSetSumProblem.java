public class SubSetSumProblem {
    public static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return recursvieSubsetSum(arr,arr.length-1,sum);
    }

    public static boolean recursvieSubsetSum(int [] arr,int index,int target){
        // First always write base cases

        // First base is that we have found the target
        if (target == 0) return true;

        // Secound is that at last element we have found the target
        if (index == 0 && target == arr[index]) return true;

        // Third is that we have not found it
        if (index < 0) return false;

        // Then, two choices to take or not take

        boolean notTake = recursvieSubsetSum(arr,index-1,target);
        boolean take = false;
        // At any point target is smaller than the arr[index] we need to not check so,
        if (target >= arr[index]){
            take = recursvieSubsetSum(arr,index-1,target-arr[index]);
        }

        return take || notTake;


    }

    public static void main(String[] args) {
        int [] arr ={1,2,3};
        System.out.println(isSubsetSum(arr,6));
    }
}
