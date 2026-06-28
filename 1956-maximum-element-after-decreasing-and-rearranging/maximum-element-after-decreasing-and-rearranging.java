class Solution {
    public static int max(int[] arr){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>res) res=arr[i];
        }
        return res;
    }
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        if(arr[0]!=1){
            arr[0]=1;
        }
        for(int i=1;i<n;i++){
            if(Math.abs(arr[i]-arr[i-1])<=1){
                continue;
            }else{
                arr[i]=arr[i-1]+1;
            }
        }
        int answer=max(arr);
        return answer;
    }
}