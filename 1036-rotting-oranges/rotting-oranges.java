class Solution {
    public static void dfs(int[][] grid,int[][] res,int i,int j,int currentime,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m ||currentime>=res[i][j] || grid[i][j]==0){
            return ;
        }
        res[i][j]=currentime;
        dfs(grid,res,i-1,j,currentime+1,n,m);
        dfs(grid,res,i+1,j,currentime+1,n,m);
        dfs(grid,res,i,j-1,currentime+1,n,m);
        dfs(grid,res,i,j+1,currentime+1,n,m);

    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(n==0) return -1;
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(res[i],Integer.MAX_VALUE);
        } 

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(grid,res,i,j,0,n,m);
                }
            }
        }
        int time=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(res[i][j]==Integer.MAX_VALUE){
                        return -1;
                    }
                    time=Math.max(time,res[i][j]);
                }
            }
        }
        return time;
    }
}