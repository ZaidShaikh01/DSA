public class JumpGame {

    public static boolean maxJump(int []nums){
        int maxJump=0;

        for (int i=0;i<nums.length;i++){

            if (i>maxJump){
                return false;
            }

            maxJump=Math.max(maxJump,i+nums[i]);

        }

        return true;
    }
    public static void main(String[] args) {
        int [] arr={3,2,1,0,4};
        System.out.println(maxJump(arr));

    }
}
