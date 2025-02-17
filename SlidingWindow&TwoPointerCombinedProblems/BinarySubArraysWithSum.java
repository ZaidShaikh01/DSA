public class BinarySubArraysWithSum {

    public static int numSubarraysWithSum(int[] nums, int goal) {

        int count=0;
        int right=0;
        int left=0;
        int sum=0;


         // Logic to write the code

       while (right<nums.length && left<=right){

           sum+=nums[right];
           if(sum==goal){
               count++;
           }
           while (sum > goal) {
               sum-=nums[left];
               left++;
           }
           count+=right-left+1;



       }


        System.out.println(sum);


        return count;
    }

    public static void main(String[] args) {

        int [] arr={1,0,1,0,1};
        System.out.println(numSubarraysWithSum(arr,2));


    }
}
