import java.util.*;
public class ShellGame {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (position == a) position = b;
            else if (position == b) position = a;
        }
        System.out.println(position);
    }
}
