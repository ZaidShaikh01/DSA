import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {


    /*
    Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:

nums = [1,4]

Output :[[1,4],[4,1]]

Example 2:

nums = [1,4,5]

Output :[[1,4,5],[1,5,4],[4,1,5],[4,5,1],[5,1,4],[5,4,1]]

SO, We can have multiple fav solutions, SO backtracking
     */

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helperPermute(nums,0,result);


        return result;
    }

    public static void helperPermute(int []nums,int i,List<List<Integer>> result){
        if (i==nums.length-1){
            // Converting the int array in Integer type

            List<Integer> tempList=new ArrayList<>();
            // Adding the elements one by one
            for (int num:nums) tempList.add(num);


            result.add(tempList);
        }
        for(int j=i;j<nums.length;j++){

            // Before going into recuresion
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;

            helperPermute(nums,i+1,result);

            // After reverting the changes

            temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;

        }

    }
    public static void main(String[] args) {
        Permutations perm = new Permutations();
        int[] nums = {1, 4, 5};
        List<List<Integer>> permutations = perm.permute(nums);
        System.out.println(permutations);
    }
}
