import java.util.Enumeration;

public class MaximumPointYouCanObtainFromCards {

    public static int maxPoint(int[]arr,int k){
        int lSum=0;
        int maxSum=0;
        int rSum=0;
        int lastIndex=arr.length-1;

        for (int i=0;i<k;i++){
            lSum+=arr[i];

        }
        maxSum=lSum;

        for (int i=k-1;i>=0;i--){
            lSum=lSum-arr[i];
            rSum=rSum+arr[lastIndex];
            lastIndex--;
            maxSum=Integer.max(maxSum,lSum+rSum);
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,1};
        System.out.println(maxPoint(arr,3));
    }
}
