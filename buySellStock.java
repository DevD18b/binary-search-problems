public class buySellStock {
    
public static int buyOrSellTheStock(int [] arr , int n , int k){


    return helper(0, k, 0, arr, n);




}
public static int buySellWithMaxProfit(int [] prices , int k){

    int n =  prices.length;

    int [][][] dp = new int[n+1][1][k+1];


    for(int index = n-1; index>=0; index--){
        for(int buy = 0; buy<=1; buy++){
            for(int cap = 1; cap<=k; cap++){
                if(buy==0){
                    dp[index][buy][cap] = Math.max(dp[index+1][0][cap] , -prices[index]+dp[index+1][1][cap]);
                }
                if(buy==1){
                    dp[index][buy][cap] = Math.max(dp[index+1][1][cap] , prices[index]+dp[index+1][0][cap-1]);
                }
            }
        }
    }
    return dp[0][0][k];






}

public static int spaceOptimization(int [] price , int k){
    int [][]  ahead = new int[2][k+1];
    int [][] cur = new int[2][k+1];

    int n = price.length;

for(int i =n-1; i>=0; i--){
    for(int buy = 0;buy<=1; buy++){
        for(int cap = 1;  cap<=k; cap++)
        {
            if(buy==0){
                cur[buy][cap] = Math.max(ahead[0][k],-price[i]+ahead[1][k]); 
            }
            if(buy==1){
                cur[buy][cap] = Math.max(ahead[1][k] , price[i]+ahead[0][k-1]);
            }
        }
        
    }
    ahead = cur;

}
return ahead[0][k];


}

public static int helper(int index , int cap , int buy , int [] arr , int n){


if(index==n || cap==0)  return 0;

int profit  = 0;

if(buy==0)
{
    int notBuying =  helper(index+1, cap,0, arr, n);
    int  buying = helper(index+1, cap, 1, arr, n)-arr[index];
    profit = Math.max(notBuying, buying);
}
if(buy==1){
    int notSelling = helper(index+1, cap, 1, arr, n);
    int selling  = helper(index+1, cap-1, 0, arr, n);
    profit = Math.max(selling,notSelling);
}

return profit;



}





}
