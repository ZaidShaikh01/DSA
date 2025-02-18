public class JosephusProblem {
    public static int findTheWinner(int n, int k) {
        return helper(n,k)+1;
    }
    public static int helper(int n, int k){
        if (n==1) return 0;
        else {
            return (helper(n-1,k)+k)%n;
        }

    }

    public static int iterativeApparoch(int n, int k){
        int prev=1;
        int survivor=0;
        for(int i = 2;i<=n;i++){
            survivor=(survivor+k)%i;

        }
        return survivor+1;
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
        System.out.println(iterativeApparoch(5,2));
    }

}
