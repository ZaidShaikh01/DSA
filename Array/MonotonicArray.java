public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {

        int first=nums[0];
        int last=nums[nums.length-1];

        if (nums.length == 0 || nums.length == 1){
            return true;
        }

        if(first<last){
            for (int i=1;i<nums.length;i++){
                int j=i-1;
                if (nums[j] > nums[i]){
                    return false;
                }


            }

        }
        else if (first==last){
            for (int i=1;i<nums.length;i++){
                int j=i-1;
                if (nums[i] != nums[j]){
                    return false;
                }


            }
        }

        else{
            for (int i=1;i<nums.length;i++){
                int j=i-1;
                if (nums[j] < nums[i]){
                    return false;
                }

            }

        }

        return true;
    }

    public static void main(String[] args) {
        int []  arr={1,2,3,44,55};
        System.out.println(isMonotonic(arr));
    }
}
