public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        else{

            int currentPosition=0;

            for(int i=1;i<nums.length;i++){
                if(nums[currentPosition] != nums[i]){
                    nums[++currentPosition]=nums[i];
                }
            }
            return currentPosition+1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,4,4,4,4,4}; // Input array
        int[] expectedNums = {1,2,3,4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

}
