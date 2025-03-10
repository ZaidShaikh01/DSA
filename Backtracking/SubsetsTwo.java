import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsTwo {


    public static List<List<Integer>> subsetsWithDup(int[] nums) {


        List<List<Integer>> resultList=new ArrayList<>();

        // Calling the backtrack method
        // Sorting the array before calling the function
        Arrays.sort(nums);

        backtrack(resultList,new ArrayList<>(),0,nums);

        return resultList;

    }


    public static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int start, int [] nums){
        // TODO -- Write a base condition
            if(!resultList.contains(tempList)){
                resultList.add(new ArrayList<>(tempList));
            }
        //Iterate through choices
            for(int i=start;i<nums.length;i++) {


                // Validate the choices
                    tempList.add(nums[i]);
                // Backtrack
                    backtrack(resultList,tempList,i+1,nums);
                // Reverse the decision
                    tempList.remove(tempList.size()-1);

            }


    }
    public static void main(String[] args) {


    }
}
