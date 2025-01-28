import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {



    public static boolean containsDuplicate(int [] arr){

        HashMap<Integer,Integer> hash= new HashMap<>();

        for (int i=0;i<arr.length;i++){



            hash.put(arr[i], hash.getOrDefault(arr[i],0)+1);

            if (hash.get(arr[i])>1){
                return true;
            }

        }
        return false;



    }
    public static void main(String[] args) {

        int [] arr= {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));

    }
}
