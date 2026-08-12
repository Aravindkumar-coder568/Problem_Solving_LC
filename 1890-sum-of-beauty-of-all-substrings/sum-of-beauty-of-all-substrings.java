class Solution {
    public static int beauty(String sub){
        int[] freq=new int[26];
        for(char ch:sub.toCharArray()){
            freq[ch-'a']++;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]>0){ // to solve the problem like min as 0;
                max=Math.max(max,freq[i]);
                min=Math.min(min,freq[i]);
            }
        }
        return max-min;
    }
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=s.substring(i,j);
                ans+=beauty(sub);
            }
        }
        return ans;
    }
}