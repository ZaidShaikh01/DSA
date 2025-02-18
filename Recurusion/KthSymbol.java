public class KthSymbol {
    public static int kthGrammar(int n, int k) {

        /*
        So, The base case if ofc f(1) which will give 0. Other than that
        0
        01
        01 10
        0110 1001

        so as you see we are basically calling half function again and half of the negation of smaller function.... Hence we use recursion
         */
        if(n==1 || k==1){
            return 0;
        }

        int length= (int) Math.pow(2,n-1);
        int half=length/2;
        if (k<=half){
            return kthGrammar(n-1,k);
        }
        else {
            return kthGrammar(n-1,k-half)^1;
        }

    }

    public static void main(String[] args) {

        System.out.println(kthGrammar(4,7));
    }
}
