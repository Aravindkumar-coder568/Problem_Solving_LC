class Solution {
    public long sumAndMultiply(int n) {
        long res=0;
        int sum=0;
        long x=0;
        String num=Integer.toString(n);
        for(char ch:num.toCharArray()){
            if((ch-48)!=0){
                x=x*10+(ch-48);
                sum+=ch-48;
            }
        }
        res=x*sum;
        return res;

    }
}