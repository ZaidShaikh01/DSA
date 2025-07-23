import java.util.*;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        sc.nextLine();
        String[] str = sc.nextLine().trim().split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int step;

        if (maxIndex > minIndex) {
            step = maxIndex + (arr.length - 1 - minIndex) - 1;
        } else {
            step = maxIndex + (arr.length - 1 - minIndex);
        }

        System.out.println(step);
    }
}
