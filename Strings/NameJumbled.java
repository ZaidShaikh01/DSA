import java.util.*;

public class NameJumbled {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        String combined = str1 + str2;
        Map<Character, Integer> hashMap = new HashMap<>();

        for(char ch : combined.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str3.toCharArray()){
            if(!hashMap.containsKey(ch) || hashMap.get(ch) == 0){
                System.out.println("NO");
                return;
            }
            hashMap.put(ch, hashMap.get(ch) - 1);
        }

        for(int count : hashMap.values()){
            if(count != 0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
