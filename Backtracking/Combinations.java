import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> resList=new ArrayList<>();

        backtrack(resList,new ArrayList<>(),1,n,k);

        return resList;


    }

    public void backtrack(List<List<Integer>> resList,List<Integer> tempList,int start,int n,int k){

        // Base Condition
        if(tempList.size()==k){
            resList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i=start;i<=n;i++){

            // Adding the new Ith element and then Iterating
            tempList.add(i);
            // Calling the backtrack function on I itself
            backtrack(resList,tempList,i+1,n,k);
            //Removing the Ith Element and then going to the next Ith element
            tempList.remove(tempList.size()-1);


        }
    }



}
