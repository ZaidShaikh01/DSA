import java.util.*;

public class NextRound {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        String[] scoreStr = sc.nextLine().trim().split(" ");
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(scoreStr[i]);
        }

        int kthScore = scores[k - 1];
        int count = 0;
        for(int score : scores){
            if(score >= kthScore && score > 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
