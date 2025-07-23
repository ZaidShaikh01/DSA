import java.util.*;
public class HashMapThing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean allEven = true;
        Map<Character,Integer> hashMap = new HashMap<>();
        for(int i =0;i<str.length();i++){
            hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            if(entry.getValue() % 2 != 0){
                allEven = false;
                break;
            }
        }
        System.out.println(allEven ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
