import java.util.*;
public class PreFixArray {
    public static void prefixSum(int [] nums){

        for(int i =1;i< nums.length;i++){

            nums[i] += nums[i-1];
        }
    }
    public static int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0) return 0;
        //prefixSum(nums);
        int minLength =Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target ){
                minLength = Math.min(minLength, i - left + 1);
                sum -=nums[left];
                left++;
            }



        }


        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String []  args){
        int [] a = {2,3,1,2,4,3};

        System.out.print(minSubArrayLen(7,a));
    }
}
