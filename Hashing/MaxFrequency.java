import java.util.Arrays;

public class MaxFrequency {

    public static int maxFrequency(int[] nums, int k) {

        int count=1;
        Arrays.sort(nums);

        //! This loop will iterate through each element in array

        for (int i=0;i<nums.length;i++){

            //! a logical code to find the number which can be genrated by adding the value K.
            for (int j=nums.length-1;j>=0;j++){
                while (k>0){
                    if(nums[i]==nums[j]){
                        count++;
                        break;
                    }
                    nums[i]++;
                    k--;
                }
            }

        }

        return count;



    }


    public static void main(String[] args) {
        int [] nums={1,2,4};
        int k =5;

        maxFrequency(nums,k);

    }
}
