import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutations2 {


    /*
    Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.



Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]


Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10
     */

    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        helperPermuteUnique(nums,0,result,map);
        return result;

    }

    public static void helperPermuteUnique(int [] nums, int i, List<List<Integer>> results,HashMap map){

        if(i == nums.length - 1){

            List<Integer> tempList=new ArrayList<>();
            for(int num:nums) tempList.add(num);

            results.add(tempList);
        }

        for (int j=i;j<nums.length;j++){
            if (!map.containsValue(nums[j])){


                map.put(j,nums[j]);
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;

                helperPermuteUnique(nums,i+1,results,map);

                // After reverting the changes

                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }


    }

    public static void main(String[] args) {

    }
}
