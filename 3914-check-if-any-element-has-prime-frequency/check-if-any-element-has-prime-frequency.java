class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n=nums.length;
        if(n<2) return false;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0) +1);
        }
        // int max=0;
        // for(int num:nums){
        //     if(num>max) max=num;
        // }
        // int range=Math.max(max+1,2);
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=0;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }

        for (int count :freq.values()) {
            if(isPrime[count]) {
                return true;
            }
        }
        return false;
    }
}