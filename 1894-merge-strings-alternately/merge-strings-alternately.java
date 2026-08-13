class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        String maxStr=word1.length()>word2.length()?word1:word2;
        int minLen=Math.min(word1.length(),word2.length());
        while(i<n || j<m){
            if(i<n){
                sb.append(word1.charAt(i++));
            }
            if(j<m){
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}