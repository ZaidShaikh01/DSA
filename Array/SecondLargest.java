public class SecondLargest {
    public static void secondLargest(int []arr){
        int firstMax =Integer.MIN_VALUE;
        int secoundMax=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]> firstMax){
                firstMax =arr[i];
            }
        }
        for (int i=0;i< arr.length;i++){
            if (arr[i]> secoundMax && arr[i]!=firstMax){
                secoundMax=arr[i];
            }
        }
        System.out.println(secoundMax);

    }

    public static void main(String[] args) {

        int [] arr={1,2,4,5,2,6,7,12};
        secondLargest(arr);

    }
}
