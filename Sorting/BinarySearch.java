public class BinarySearch {

    public static int binarySearch(int [] arr,int key){

        int low=0;
        int high=arr.length-1;


        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if (arr[mid]>key){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;



    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6};
        System.out.println(binarySearch(arr,1));

    }
}
