public class setMatrixZero {

    public static void setMatrixZero(int [][] arr){


        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr.length;j++){

            }
        }

    }
    public static void printArray(int [][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] arr={{1,1,1},{1,0,1},{1,1,1}};
        printArray(arr);


    }
}
