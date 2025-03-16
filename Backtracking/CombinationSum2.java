import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // Creating a list
        List<List<Integer>> resList=new ArrayList<>();
        // Sorting the candidates array as it looks like it is required in the answer
        Arrays.sort(candidates);
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
        if (sum==target && !resList.contains(tempList)){
            // adding the value and return
            resList.add(new ArrayList<Integer>(tempList));
            return;
        }

        // Iterating through choices
        for(int i=start;i< candidates.length;i++){
            // Adding the new Ith element and then Iterating
            tempList.add(candidates[i]);
            // Adding the sum value
            sum+= tempList.get(tempList.size()-1);


            // Calling the function on The Ith element itself
            helperFunction(resList,tempList,candidates,i+1,target,sum);
            // Removing the Ith element
            sum-= tempList.get(tempList.size()-1);
            tempList.remove(tempList.size()-1);

        }
    }
    public static void main(String[] args) {

    }
}
