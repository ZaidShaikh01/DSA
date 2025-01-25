public class CheckIfArrayIsSorted {

    public static boolean isSorted(int [] nums){
        int rotationPoint=0;
        if (nums.length==1){
            return true;
        }
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                rotationPoint++;
            }
        }
        if (rotationPoint>1){
            return false;
        }
        if (rotationPoint==1){
            if (nums[nums.length-1]>nums[0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(isSorted(arr));

    }
}
