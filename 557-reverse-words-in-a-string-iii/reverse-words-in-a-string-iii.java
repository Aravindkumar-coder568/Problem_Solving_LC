class Solution {
    public String reverseWords(String s) {
        char[] ch=s.toCharArray();
        int n=s.length();
        int st=-1;
        for(int i=0;i<=n;i++){
            if(i==n || ch[i]==' '){     
                int j=st+1;
                int k=i-1;
                while(j<k){
                    char temp=ch[j];
                    ch[j]=ch[k];
                    ch[k]=temp;
                    j++;
                    k--;
                }
                st=i;
            }
        }
        return new String(ch);
    }
}