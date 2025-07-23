import java.util.*;
public class StringTask {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y';
    }
    public static String toLowerCase(String str){
        String str1 = "";
        char ch =' ';
        for(int i = 0;i<str.length();i++){
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ){
                ch = (char)(str.charAt(i) + 32);
            }
            else{
                //str1 += (char) '.';
                ch = (char)(str.charAt(i));
            }
            str1 += ch;
        }
        return str1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toLowerCase(str));
        String str1 = "";
        for(int i = 0 ;i<str.length();i++){

            if(!isVowel(str.charAt(i))){
                str1+= '.';
                str1+= str.charAt(i);
            }
        }
        System.out.println(toLowerCase(str1));
    }
}
