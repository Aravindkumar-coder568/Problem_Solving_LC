class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int preSUM=nums[0];
        int range=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                preSUM+=nums[i];
                range++;
            }else{
                break;
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        while(set.contains(preSUM)){
            preSUM++;
        }
        return preSUM;
    }
}