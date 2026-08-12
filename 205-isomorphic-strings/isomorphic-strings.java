class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        int[] freq1=new int[256];
        int[] freq2=new int[256]; // it ontains 1 also
        for(int i=0;i<n;i++){
            if(freq1[s.charAt(i)]!=freq2[t.charAt(i)]){
                return false;
            }
            freq1[s.charAt(i)]=i+1; 
            freq2[t.charAt(i)]=i+1;
        }
        return true;
    }
}