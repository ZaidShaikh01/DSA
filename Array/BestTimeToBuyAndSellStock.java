public class BestTimeToBuyAndSellStock {

    public static int bestTimeToBuyAndSellDryRun(int []arr){
        int bestBuy=0;
        if (arr.length==1){
            return bestBuy;
        }
        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int currentProfit=arr[j]-arr[i];
                    if (bestBuy<currentProfit){
                        bestBuy=currentProfit;
                    }
                }

            }
        }

        return bestBuy;

    }
    public static void main(String[] args) {
        int [] arr={6,7};
        System.out.println(bestTimeToBuyAndSellDryRun(arr));

    }
}
