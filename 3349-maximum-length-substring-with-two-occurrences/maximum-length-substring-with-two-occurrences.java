class Solution {
    public static int isValid(String s){
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']>2){
                return 0;
            }
        }
        return s.length();
    }
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=s.substring(i,j);
                max=Math.max(max,isValid(sub));
            }
        }
        return max;
    }
}