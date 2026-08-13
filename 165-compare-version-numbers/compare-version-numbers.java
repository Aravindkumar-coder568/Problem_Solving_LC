class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
        int n=arr1.length;
        int m=arr2.length;
        int range=Math.max(n,m);
        for(int i=0;i<range;i++){
            int num1=0;
            int num2=0;
            if(i<n) num1=Integer.parseInt(arr1[i]);
            if(i<m) num2=Integer.parseInt(arr2[i]);
            if(num1>num2) return 1;
            if(num1<num2) return -1;
        }
        return 0;
    }
}