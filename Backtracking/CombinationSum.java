import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// The answer and logic is very simple Do the changes then Undo the changes that's it....
public class CombinationSum {

        public static List<List<Integer>> combinationSum(int[] candidates, int target) {

            // Creating a result list to store the values
            List<List<Integer>> resultList=new ArrayList<>();
            // Calling the backTrack function
            backTrackHelper(resultList,new ArrayList<>(),candidates,0,target,0);
            // Returning the answer
            return resultList;

        }

        public static void backTrackHelper(List<List<Integer>> resList, List<Integer> tempList,int [] candidates ,int start, int target, int sum){

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

            // Iterating through choices
            for(int i=start;i< candidates.length;i++){
                // Adding the new Ith element and then Iterating
                tempList.add(candidates[i]);
                // Adding the sum value
                sum+= tempList.get(tempList.size()-1);


                // Calling the function on The Ith element itself
                backTrackHelper(resList,tempList,candidates,i,target,sum);
                // Removing the Ith element
                sum-= tempList.get(tempList.size()-1);
                tempList.remove(tempList.size()-1);



            }

        }


    public static void main(String[] args) {



    }
}
