public class CountZero {
    public static int countZero(int n, int count){
        if(n%10 == n){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return countZero(n/10,count+1);
        }
        return countZero(n/10, count);
    }
    public static void main(String [] args){
        System.out.print(countZero(100,0));
    }

}
