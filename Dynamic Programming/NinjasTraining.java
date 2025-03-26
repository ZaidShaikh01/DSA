import java.util.Arrays;

public class NinjasTraining {

    /*
    Geek is going for a training program for n days. He can perform any of these activities: Running, Fighting, and Learning Practice. Each activity has some point on each day. As Geek wants to improve all his skills, he can't do the same activity on two consecutive days. Given a 2D array arr[][] of size n where arr[i][0], arr[i][1], and arr[i][2] represent the merit points for Running, Fighting, and Learning on the i-th day, determine the maximum total merit points Geek can achieve .
     */

    // Memoiation apparoch
//    public static int maximumPoints(int arr[][]) {
//        // code here
//        int n = arr.length;
//        int taskCount = arr[0].length;
//        int [][] dp = new int [n][taskCount+1];
////        for(int i=0;i< arr.length;i++){
////            for (int j=0;j<arr[0].length;j++){
////                dp[i][j]=-1;
////            }
////        }
//        for (int i = 0; i < n; i++) {
//            Arrays.fill(dp[i], -1); // Correct DP initialization
//        }
//        return recursiveMaximumPoints(arr,n-1,taskCount,dp); // Starting with no chosen task
//
//    }
//
//    public static int recursiveMaximumPoints(int arr[][], int day,int lastTask,int [][] dp){
//        int taskCount = arr[0].length;
//
//        // If the index is 0 then we simply have to return the maximum point
//        if(day == 0){
//            int max=0;
//
//            for (int i=0;i<taskCount;i++) {
//                if (i != lastTask) {
//                    max = Math.max(max, arr[0][i]);
//
//                }
//            }
//            return dp[day][lastTask] = max;
//        }
//        if(dp[day][lastTask] !=-1){
//            return dp[day][lastTask];
//        }
//        // On the days other than the 0 we have to do recursion to find out the tasks, But we'll need the loop again
//        int max=0;
//        for (int i=0;i<taskCount;i++) {
//            // Here we are summing up the today's task and teh task previously we are sharing the index to notify that hey, we have performed this task already so don't perform it again
//            if (i != lastTask){
//                int points = arr[day][i] + recursiveMaximumPoints(arr, day - 1, i,dp);
//                max = Math.max(max, points);
//            }
//        }
//        return dp[day][lastTask]=max;
//    }

    public static int maximumPoints(int points[][]) {
        // code here
        int n = points.length;

        int [] dp = new int [4];

        // First of all we have to initialize the value when index is 0
        // For assigning the values of dp[0] we do
        dp[0] = Math.max(points[0][1], points[0][2]);
        dp[1] = Math.max(points[0][0], points[0][2]);
        dp[2] = Math.max(points[0][0], points[0][1]);
        dp[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

//        for (int i=0;i<taskCount;i++) {
//            // Here we are summing up the today's task and teh task previously we are sharing the index to notify that hey, we have performed this task already so don't perform it again
//            if (i != lastTask){
//                int points = arr[day][i] + recursiveMaximumPoints(arr, day - 1, i,dp);
//                max = Math.max(max, points);
//            }
//        }
//        return dp[day][lastTask]=max;



        for (int day=1;day< n;day++){
            int [] temp = new int[4];
            for(int task=0;task<4;task++){
                temp[task]=0;

                for (int currTask=0;currTask<=2;currTask++) {
//            // Here we are summing up the today's task and teh task previously we are sharing the index to notify that hey, we have performed this task already so don't perform it again
                if (currTask != task){

                    temp[task] = Math.max(temp[task], points[day][currTask] + dp[currTask]);

                    }
                }

            }
            dp = temp;

            // So, Basically we are taking only one prev array then we are collecting today's value, then we are again storing the values in previous array
        }
        return dp[3]; // Starting with no chosen task

    }
    public static void main(String[] args) {
        int [][] arr= {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        System.out.println(maximumPoints(arr));

    }
}
