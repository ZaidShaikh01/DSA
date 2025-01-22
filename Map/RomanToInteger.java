import java.util.HashMap;

public class RomanToInteger {

    public static int romToInt(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('V', 5);
        map.put('X', 10);
        map.put('I', 1);
        map.put('L', 50);
        map.put('C',100);
        map.put('D', 500);
        map.put('M', 1000);

        int numericValue=0;
        char[] currentChar= str.toCharArray();

        for (int i=0;i<currentChar.length-1;i++){

            if (map.get(currentChar[i])<map.get(currentChar[i+1])){
                numericValue-=map.get(currentChar[i]);
            }
            else {
                numericValue+=map.get(currentChar[i]);
            }

        }
        numericValue+=map.get(currentChar[currentChar.length-1]);
        return numericValue;

    }
    public static void main(String[] args) {
        String str="XIX";
        System.out.println((romToInt(str)));


    }
}
