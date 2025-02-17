public class printA {

    public static void printA(int n){

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (i==0 && j==2){
                    System.out.print("*");
                }
                else if ( (i==1 && j==1) || (i==1 && j==3) ){
                    System.out.print("*");
                } else if ((i==2 && j==0) || (i==2 && j==4) || (i==4 && j==0) || (i==4 && j==4)) {
                    System.out.print("*");
                } else if (i==3) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printA(5);

    }
}
