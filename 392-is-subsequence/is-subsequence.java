class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        // int i=0;
        // int j=0;
        // while(i<n && j<m){
        //     if(s.charAt(i)==t.charAt(j)){
        //         i++;
        //     }  => also true
        //     j++;
        // }
        int i=0;
        for(char ch:t.toCharArray()){
            if(i<s.length() && ch==s.charAt(i)){
                i++;
            }
        }
        return i==n;
    }
}