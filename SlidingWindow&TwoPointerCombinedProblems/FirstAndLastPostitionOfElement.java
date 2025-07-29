public class FirstAndLastPostitionOfElement {
    public int[] searchRange(int[] nums, int target) {
        int left =0;
        int right=nums.length-1;
        int [] arr = new int [2];
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                left = mid;
                right =mid;
                while(left >= 0 && nums[left] == target){
                    left--;
                }
                while(right < nums.length && nums[right] == target){
                    right++;
                }
                arr[0] =left+1;
                arr[1] = right-1;
                return arr;
            }
            else if(target < nums[mid]){
                right = mid -1;
            }
            else{
                left = mid+1;
            }
        }
        return new int[]{-1, -1};
    }
}
