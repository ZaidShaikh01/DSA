//import java.util.ArrayList;
//
//public class FindUnion {
//    public static void unionArray(int [] arr1,int [] arr2){
//        int n1=arr1.length;
//        int n2=arr2.length;
//        ArrayList<Integer> unionArray=new ArrayList<>();
//        int i=0,j=0;
//
//        while (i<n1 && j< n2){
//            if(arr1[i]<=arr2[j]){
//
//                if (unionArray.isEmpty() || unionArray.getLast() != arr1[i]) {
//
//                    unionArray.add(arr1[i]);
//                }
//                i++;
//
//            }
//            else {
//                if (unionArray.isEmpty() || unionArray.getLast()!=arr2[j]){
//                    unionArray.add(arr2[j]);
//                }
//                j++;
//
//            }
//        }
//        while (i<n1){
//            if (unionArray.isEmpty() || unionArray.getLast()!=arr1[i]){
//                unionArray.add(arr1[i]);
//            }
//            i++;
//
//        }
//        while (j<n2){
//            if (unionArray.isEmpty() || unionArray.getLast()!=arr2[j]){
//                unionArray.add(arr2[j]);
//            }
//            j++;
//
//        }
//
//        System.out.println(unionArray);
//    }
//    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5};
//        int b[] = {1, 2, 3, 6, 7};
//        unionArray(a,b);
//
//    }
//}
