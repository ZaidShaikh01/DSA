public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums) {
        int negativeCount= findFirstNonNegativeCount(nums);
        int positiveCount= nums.length-findFirstPositiveCount(nums);

        return Math.max(positiveCount,negativeCount);
    }
    public static int findFirstNonNegativeCount(int []arr){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;

            if (arr[mid]<0){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low;

    }
    public static int findFirstPositiveCount(int []arr){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid=low + (high-low)/2;

            if (arr[mid]<=0){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low;

    }
    public static void main(String[] args) {
        int []arr={0,0,0,0,0,0};
        System.out.println(maximumCount(arr));
    }
}
