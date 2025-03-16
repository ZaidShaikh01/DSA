import java.util.ArrayList;
import java.util.List;

public class Combination3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> resList=new ArrayList<>();

        // Let's make a choice array
        int [] choices={1,2,3,4,5,6,7,8,9};

        // Calling the backTrackCombination
        backtrackCombination(resList,new ArrayList<>(),0,0,n,k,choices);

        // return res
        return resList;

    }
    public static void backtrackCombination(List<List<Integer>> resList,List<Integer> tempList,int start,int sum,int target,int size,int [] choices){
        // Base Condition
        if (sum>target){
            return;
        }
        if (sum == target && tempList.size()==size){
            resList.add(new ArrayList<>(tempList));
            return;
        }
        // Recursive condition

        for (int i=start;i<choices.length;i++){
            // First adding the element
            sum+=choices[i];
            tempList.add(choices[i]);
            // Recursive condition
            backtrackCombination(resList,tempList,i+1,sum,target,size,choices);
            // Backtrack conditions
            sum-=choices[i];
            tempList.remove(tempList.size()-1);
        }
    }
}
