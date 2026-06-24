class Solution {
    public static int max(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }
    public static int sumOfDiv(int[] arr,int div){
        int sum = 0;
        for (int num:arr) {
            sum += Math.ceil((double)num/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=max(nums);
        int ans=-1;
        while(low<=high){
            int mid=(low + high) /2;
            if(sumOfDiv(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        //int max=max(nums);

        // for(int i=1;i<=max;i++){
        //     int sum=0;
        //     for(int j=0;j<n;j++){
        //         sum += (nums[j] + i - 1) / i; //for ceil
        //     }
        //     if(sum<=threshold) return i;
        // }
        // return 1;
    }
}