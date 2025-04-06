public class ClimbingStairs {

    // Here in this problem is that if we have to go to N stairs then
    // We first need to go to N-1 stairs, Hence we can solve it using recursion
    // We can use dynamic apparoch as we know that some problems are overlapping
    // Also, for n = 2 the output is 2 & for 3 it is 3 & for n = 4 it is 5
    // For n = 5 it is 5+3 = 8, Hence we can easily say that this is fibonacci series
    // So solving this by fibonacci way will give you the ans

    public static int climbStairs(int n) {

        if ( n <= 1 ){
            return n;
        }

        int prev = 1;
        int prev2 = 0;
        // For f(n) the value I'm getting is of fib(n+1) hence, I'm running this upto n+1
        for(int i=2;i<=(n+1);i++){
            int current = prev + prev2;
            prev2 = prev;
            prev = current;

        }
        return prev;
    }

    // I will do revision of climbing stairs


    public static void main(String[] args) {

        System.out.println(climbStairs(2));

    }
}
