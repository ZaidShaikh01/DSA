public class MaxConsecutiveOne {

    public static int countConsecutiveOnes(int [] arr){
        int count=0;

        int max=0;

        for (int i=0;i<arr.length;i++){

            if (arr[i]==1){
                count++;
            }
            else {
                count=0;
            }
            if(count>max){
                max=count;
            }

        }
        return max;


    }
    public static void main(String[] args) {
        int [] nums={1,1,1,1};
        System.out.println(countConsecutiveOnes(nums));


    }
}
