/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        // This is the List of List which contains integer
        List<List<Integer>> resultList=new ArrayList<>();

        // Calling the backtrack function

        backtrack(resultList,new ArrayList<>(),nums,0);

        return resultList;
    }


    // We are going to use Backtracking template to solve this problem

    // resultList Stores TempList
    // tempList is the state
    // nums is the input that is given
    // Start shows the choices


    public static void backtrack(List<List<Integer>> resultList,List<Integer> tempList, int [] nums, int start ){

        // BaseCondition Adding to the resultList
        resultList.add(new ArrayList<>(tempList));

        // Iterating through all the choices available

        for(int i=start;i<nums.length;i++){

            // We don't need to validate anything so we don't need the if condition

            // Case of adding the element in the list
            tempList.add(nums[i]);

            // Going to the next stage That is next element
            backtrack(resultList,tempList,nums,i+1);

            // Case of not adding the element in the list

            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args) {

    }
}
