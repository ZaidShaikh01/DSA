import java.util.Arrays;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

public class Majority_Element {

        public static int majorityElement(int[] nums) {

            return nums[nums.length/2];

        }


    public static void main(String[] args) {
            int [] arr= {1,2,2,2,3,4,5,5,6,6,6,6,6,6,6,6,7,7,7};
            Arrays.sort(arr);
        System.out.println(majorityElement(arr));

    }
}
