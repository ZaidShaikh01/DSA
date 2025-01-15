import java.util.Arrays;

public class MissingElement {

    public static int missingNumber(int[] nums) {
        int missingNumber=0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==i){
                continue;
            }
            missingNumber=i;
            break;
        }
        if(nums[0]!=0){
            return 0;
        }
        if(missingNumber==0){
            missingNumber=nums[nums.length-1]+1;
        }
        return missingNumber;


    }

    public static void main(String[] args) {

        int [] arr={7,1,5,3,6,2,0,8,9};
        int miss=missingNumber(arr);
        System.out.println(miss);

    }
}
