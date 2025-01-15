import java.util.HashMap;

public class HashingUsingHashMap {


    public static void main(String[] args) {

        HashMap<Character,Integer> hashMap=new HashMap<>();
        String s="ZaID Is Pretty GOod At tHe Stuff He DOeS!!";

        for (int i=0;i<s.length();i++){
            char currentChar=s.charAt(i);
            hashMap.put(currentChar, hashMap.getOrDefault(currentChar,0)+1);
        }

        for (char key: hashMap.keySet()){
            System.out.println(key+" : "+hashMap.get(key));
        }

        System.out.println(hashMap);

    }
}
