class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        int count=0;
        int max=Integer.MIN_VALUE;
        for(char ch:arr){
            if(ch=='('){
                count++;
            }else if(ch==')'){
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}