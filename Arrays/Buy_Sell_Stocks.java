package Array;

public class Buy_Sell_Stocks {
    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            int diff = prices[i] -mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] ={7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println(ans); 
    }
}
