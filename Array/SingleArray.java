public class SingleArray {
    public static int singleNumber(int []nums){
        int singleNumber=nums[0];
        int xor=0;
        if (nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }

        return xor;
    }
    public static void main(String[] args) {
        int [] nums={1};
        System.out.println(singleNumber(nums));

    }
}
