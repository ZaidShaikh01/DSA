public class maximumSubArray {

    public static int maxSumOfSubArray(int []arr){

        int maximum=Integer.MIN_VALUE;


        int sum=0;
        int ansStart=-1;
        int ansEnd=-1;
        int start=0;

        for (int i=0;i<arr.length;i++){

            if(sum==0){
                start=i;
            }

            sum+=arr[i];

            if (maximum<sum){

                maximum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if (sum<0) sum=0;

        }
        System.out.println("Now printing the sub array that gives maximum sum: ");
        for (int i=ansStart;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        return maximum;

    }
    public static void main(String[] args) {
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum Sum: "+maxSumOfSubArray(arr));
    }
}
