import java.util.Arrays;

public class CharacterHashing {


    public static void main(String[] args) {
        String s = "aaabbbcccdddeezzrr";
        String s1 = "aaabbbcccAGGRHHdddeezzrr";


        int[] lowerCaseHash = new int[26];
        int[] upperCaseHash = new int[26];
        int[] allChar=new int [256];


        lowerCaseHash = lowercaseCharHashing(lowerCaseHash, s);
        upperCaseHash = uppercaseCharHashing(upperCaseHash, s.toUpperCase());
        allChar = allCharHashing(allChar,s1);

        printAllCharHashArray(allChar);
        System.out.println();



        printLowerHashArray(lowerCaseHash);
        System.out.println();
        System.out.println(Arrays.toString(lowerCaseHash));


        printUpperHashArray(upperCaseHash);
        System.out.println(Arrays.toString(upperCaseHash));






    }
    private static int[] allCharHashing(int []arr,String s){
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        return arr;
    }

    private static void printAllCharHashArray(int[] hashArr) {
        for (int i = 0; i < 256; i++) {

            if (hashArr[i] > 0) {

                System.out.println((char) (i) + ": " + hashArr[i]);
            }
        }

    }

    private static void printUpperHashArray(int[] hashArr) {
        for (int i = 0; i < 26; i++) {

            if (hashArr[i] > 0) {

                System.out.println((char) (i + 'A') + ": " + hashArr[i]);
            }
        }

    }

    public static void printLowerHashArray(int []hashArr) {
        for (int i = 0; i < 26; i++) {

            if (hashArr[i] > 0) {

                System.out.println((char) (i + 'a') + ": " + hashArr[i]);
            }
        }
    }
    public static int[] lowercaseCharHashing(int []hashArr,String s){
        for (int i=0;i<s.length();i++){
            hashArr[s.charAt(i)-'a']++;
        }
        return hashArr;
    }
    public static int[] uppercaseCharHashing(int []hashArr,String s){
        for (int i=0;i<s.length();i++){
            hashArr[s.charAt(i)-'A']++;
        }
        return hashArr;
    }


}
