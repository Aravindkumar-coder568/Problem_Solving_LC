class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int limit=10;
        boolean can=true;
        while(n>=limit){
            n=n-limit;
            limit--;
            can=!can;
        }
        return !can;
    }
}