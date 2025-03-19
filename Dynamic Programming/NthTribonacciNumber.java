public class NthTribonacciNumber {

    public static int tribonacci(int n) {
        // When the base case is 0
        if(n==0){
            return 0;
        }

        int prev3 = 0; // N=0
        int prev2 = 1; // N=1
        int prev = 1; // N=2
        // Now I have to just start from the three till the n
        for (int i=3;i<=n;i++){
            int curr= prev+prev2+prev3;
            prev3=prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
