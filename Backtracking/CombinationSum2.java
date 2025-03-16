import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Creating a list
        List<List<Integer>> resList=new ArrayList<>();
        // Sorting the candidates array as it looks like it is required in the answer
        Arrays.sort(candidates);

        // We will need a hashmap so that we can track the values

        // Calling the helper function
        helperFunction(resList, new ArrayList<>(),candidates,0,target,0);
        // Returning the value
        return resList;
    }

    public static void helperFunction(List<List<Integer>> resList, List<Integer> tempList,int [] candidates, int start,int target,int sum){
        // If Sum exceeds the target value then return
        if (sum>target){
            return;
        }
        // If the solution is valid then store the value in the resList
        if (sum==target){
            // adding the value and return
            resList.add(new ArrayList<Integer>(tempList));
            return;
        }
        if (start>candidates.length-1){
            return;
        }

        // Creating a hashmap here
        HashMap<Integer,Boolean> hashMap= new HashMap<>();
        // Iterating through choices
        for(int i=start;i< candidates.length;i++){
            if (!hashMap.containsKey(candidates[i])) {
                // Showing that value exists in the hash map
                hashMap.put(candidates[i], true);

                // Adding the new Ith element and then Iterating

                tempList.add(candidates[i]);
                // Adding the sum value
                sum += tempList.get(tempList.size() - 1);


                // Calling the function on The Ith element itself
                helperFunction(resList, tempList, candidates, i + 1, target, sum);
                // Removing the Ith element
                sum -= tempList.get(tempList.size() - 1);
                tempList.remove(tempList.size() - 1);
            }

        }
    }

    // This above solution is written by me but there is even a better solution
    /*
    class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();

        dfs(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void dfs(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<Integer>(comb));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i-1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            comb.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, comb, res);
            comb.remove(comb.size() - 1);
        }
    }
}
     */
    public static void main(String[] args) {

    }
}
