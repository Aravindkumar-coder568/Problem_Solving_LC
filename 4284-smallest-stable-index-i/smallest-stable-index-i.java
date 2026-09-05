class Solution {
    public static int max(int[] arr,int n){
        int res=arr[0];
        for(int i=0;i<=n;i++){
            res=Math.max(arr[i],res);
        }
        return res;
    }
    public static int min(int[] arr,int range){
        int n=arr.length;
        int res=arr[range];
        for(int i=range;i<n;i++){
            res=Math.min(arr[i],res);
        }
        return res;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int max1=max(nums,i);
            int min1=min(nums,i);
            int score=max1-min1;
            if(score<=k) return i;
        }
        return -1;
    }
}