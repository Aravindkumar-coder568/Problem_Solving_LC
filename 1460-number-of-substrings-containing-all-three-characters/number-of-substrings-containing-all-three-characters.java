class Solution {
    // public static boolean isContains(String s){
    //     int n=s.length();
    //     if(s.indexOf('a')!=-1 && s.indexOf('b')!=-1 && s.indexOf('c')!=-1){
    //         return true ;
    //     }
    //     return false;
    // }
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int left=0;
        int[] freq=new int[3];
        for(int right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+=n-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<=n;j++){
        //         String sub=s.substring(i,j);         => ALSO CORRECT
        //         if(sub)
        //         if(isContains(sub)){
        //             count++;
        //         }
        //     }
        // }
        return count;

    }
}