

public class SubArrayWithPositiveProduct {

    public static long maxProduct(int[]arr){
        int positive=0;
        int negative=0;
        int maxLen=0;
        for (int num:arr){
            if (num==0){
                positive=0;
                negative=0;
            }
            else if (num>0){
                positive++;
                negative=negative==0?negative:negative+1;
            }
            else {
                int temp=0;
                positive = negative == 0 ? negative : negative+1;
                negative=temp+1;
            }
            if (maxLen<positive){
                maxLen=positive;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int [] arr={6,2,10,1,-2,8};
        System.out.println(maxProduct(arr));

    }
}
