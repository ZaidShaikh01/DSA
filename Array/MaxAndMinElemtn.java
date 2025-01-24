public class MaxAndMinElemtn {
    public static void minAndMax(int []arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Min and max is "+min+" "+max);
    }

    public static void main(String[] args) {
        int [] arr={1,234,512,22,10};
        minAndMax(arr);
    }
}
