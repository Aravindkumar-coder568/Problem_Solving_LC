class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int n=s.length();
        int i=0;
        int sign=1;
        long res=0;
        if(s.charAt(i)=='+' || s.charAt(i)=='-') {
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            res=res*10+(s.charAt(i)-'0');
            if(sign*res>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign*res<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign*res);
    }
}