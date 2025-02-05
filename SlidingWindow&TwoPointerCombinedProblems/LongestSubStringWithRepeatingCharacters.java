import java.util.Arrays;

public class LongestSubStringWithRepeatingCharacters {


    public static int lengthOfLongestSubstring(String s) {
        int [] hash=new int [256];

        // This method fills the hash array with the value -1

        Arrays.fill(hash, -1);

        // Initializing the variables
        int left=0;
        int right=0;
        int maxLength=0;

        // Running the loop

        while (right<s.length()){
            // We are checking if the element is already visited or not here
            if (hash[s.charAt(right)]!=-1){

                // We are checking that the index of hash[right]> left... As we can not consider previous values
                // We are moving Left by one index more than repeating index
                if (hash[s.charAt(right)] >= left){
                    left=hash[s.charAt(right)]+1;
                }
            }
            // We are comparing the currentLength with maximum length
            int length=right-left+1;
            maxLength=Integer.max(length,maxLength);
            // We are updating the value of the Visited element
            hash[s.charAt(right)]=right;
            right++;
        }
        System.out.println(Arrays.toString(hash));
        return maxLength;
    }
    public static void main(String[] args) {
        String str="pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
