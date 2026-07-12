class Solution {
    int[][][] dp;
    public  int solve(int index, int buy, int cap,int[] prices){
        int n=prices.length;
        if(index==n || cap==0) return 0;
        if(dp[index][buy][cap]!=-1){
            return dp[index][buy][cap];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[index]+solve(index+1,0,cap,prices), solve(index+1,1,cap,prices));
        }else{
            profit=Math.max(prices[index]+solve(index+1,1,cap-1,prices),solve(index+1,0,cap,prices));
        }
        return dp[index][buy][cap]=profit;
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        dp=new int[n][2][k+1]; //dp[priceLength][buy][capacity]
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return solve(0,1,k,prices);
    }
}