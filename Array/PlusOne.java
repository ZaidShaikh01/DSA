import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int lastElement=digits.length-1;
        int [] testArray= new int[digits.length+1];
        int carry=0;

        if(digits[lastElement]<9){
            digits[lastElement]++;

        }

        else{

            for(int i=lastElement;i>=0;i--){

                if(digits[i]==9){
                    digits[i]=0;
                    carry=1;
                    continue;
                }
                digits[i]++;
                carry=0;
                break;

            }
            if(carry==1){
                testArray[0]=1;
                return testArray;

            }
        }


        return digits;

    }
    public static void main(String[] args) {

        int [] arr={9,8,9};

        System.out.println(Arrays.toString(plusOne(arr)));


    }
}
