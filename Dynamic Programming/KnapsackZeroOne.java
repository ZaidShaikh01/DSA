import java.util.Arrays;

public class KnapsackZeroOne {

    public static int knapsack(int W, int val[], int wt[]){
        // Why to solve this question with dynamic programming 'Cuz this 0/1 knapsack problem where some subproblems are repeated
        return recursiveKnapsack(W,val,wt,val.length-1);

    }
    public static int recursiveKnapsack(int W,int val[],int wt[],int element){

        // This is the top bottom approach

        // If the bag is full or there are no more elements
        if(element<0 || W==0){
            return 0;
        }
        // If the wt[element] is greater than the total weight then we have to move on to the next step
        if (W<wt[element]){
                return recursiveKnapsack(W,val,wt,element-1);
        }

        // First we have to take the element
        int takeElement = val[element]+recursiveKnapsack(W-wt[element],val,wt,element-1);
        // If we do not want to take the element
        int notTake = recursiveKnapsack(W,val,wt,element-1);

        return Math.max(takeElement,notTake);
    }


    public static void main(String[] args) {
        int weightOfBag= 4;
        int [] val ={1,2,3};
        int [] wt ={4,5,1};
        System.out.println(knapsack(weightOfBag,val,wt));
    }
}
