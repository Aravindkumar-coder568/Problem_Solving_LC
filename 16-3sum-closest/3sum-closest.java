class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> li=new ArrayList<>();
        int closest=nums[0]+nums[1]+nums[2];
    
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-2;j++){
        //         for(int k=0;k<n;k++){
        //             int sum=nums[i]+nums[j]+nums[k];
        //             //if(closest==target-1 || closest==target+1) return closest;
        //             if(Math.abs(sum-target)<Math.abs(closest-target)){
        //                 closest=sum;
        //             }
        //         }
        //     }
        // }
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<=Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum==target){
                    return sum;
                }
                if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return closest;
    }
}