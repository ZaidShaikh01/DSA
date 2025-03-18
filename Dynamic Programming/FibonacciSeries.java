import java.util.Arrays;

public class FibonacciSeries {

    public static int fib(int n, int [] arr){
        // Base condition for fibonacci
        if (n <= 1 ) return n;

        // Now I have to write if already exits then return
        if (arr[n] != -1){
            return arr[n];
        }

        return arr[n]=fib(n-1,arr) + fib(n-2,arr);

    }

    public static int tabFib(int n){
        int prev = 1;
        int prev2 = 0;
        int solution=0;

        for (int i=2;i<=n;i++){
            solution = prev + prev2;
            prev2 =prev;
            prev = solution;

        }
        return solution;

    }

    public static void main(String[] args) {
        int n=7;
        int [] arr=new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
        System.out.println(fib(n,arr));;

        System.out.println(Arrays.toString(arr));
        System.out.println(tabFib(8));
    }
}
