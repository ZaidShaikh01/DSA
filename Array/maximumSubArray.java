public class maximumSubArray {

    public static int maxSumOfSubArray(int []arr){
        int maximum=Integer.MIN_VALUE;
        int sum=0;

        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            maximum=Integer.max(maximum,sum);
            if (sum<0) sum=0;

        }


        return maximum;

    }
    public static void main(String[] args) {
        int [] arr={-1};
        System.out.println(maxSumOfSubArray(arr));
    }
}
