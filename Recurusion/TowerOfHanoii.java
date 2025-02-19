public class TowerOfHanoii {
    static int count=0;
    public static int towerOfHanoi(int n, int from, int to, int aux){

        // Base condition
        if (n==1){
            System.out.println("Move disk " +n+" from rod "+from+" to rod "+to);
            count+=1;
            return count;
        }

        towerOfHanoi(n-1,from,aux,to);
        System.out.println("Move disk "+n+" From rod "+" to rod "+to);
        count++;
        towerOfHanoi(n-1,aux,to,from);

        return count;
    }


    public static void main(String[] args) {
        int steps=towerOfHanoi(3,1,3,2);
        System.out.println(steps);
    }
}
