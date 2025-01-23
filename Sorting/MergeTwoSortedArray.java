import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a=m-1;
        int b=n-1;

        for(int i=m+n-1;i>=0;i--){


            if(nums1[a]<nums2[b] && a>0 && b>0){
                nums1[i]=nums2[b];
                b--;
            }
            else if (nums1[a]==nums2[b] && a>0 && b>0){
                nums1[i]=nums1[a];
                a--;
            }
            else if (nums1[a]>nums2[b] && a>0 && b>0){
                nums1[i]=nums1[a];
                a--;
            }
        }

    }
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));


    }
}
