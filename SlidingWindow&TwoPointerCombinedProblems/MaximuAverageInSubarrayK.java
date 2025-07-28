public class MaximuAverageInSubarrayK {
    public static double findMaxAverage(int[] nums, int k) {
        int sum =0;
        int avg =0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = sum/k;

        for(int i=k;i<nums.length;i++){
            sum += nums[i] + nums[i-k];
            int avgLoop = sum / k;
            avg = Math.max(avg,avgLoop);
        }
        return avg;
    }
    public static void main(String [] args){

    }
}
