class Solution {
    public int trailingZeroes(int n) {
        int fact=1;
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}