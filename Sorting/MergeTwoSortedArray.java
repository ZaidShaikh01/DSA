import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a=m-1;
        int b=n-1;
        int c= nums1.length-1;



        while(b>=0){

            if (a>=0 && nums1[a]>=nums2[b]){
                nums1[c]=nums1[a];
                a--;
                c--;
            }
            else {
                nums1[c]=nums2[b];
                c--;
                b--;
            }
        }

    }
    public static void main(String[] args) {
        int[] nums1={2,0};
        int[] nums2={1};
        int m=1;
        int n=1;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));


    }
}
