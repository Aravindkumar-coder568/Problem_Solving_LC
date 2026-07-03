class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        if(num1.equals("0")|| num2.equals("0")) return "0";
        int[] res=new int[n+m];
        for(int i=n-1;i>=0;i--){
            int dig1=num1.charAt(i)-'0';
            for(int j=m-1;j>=0;j--){
                int dig2=num2.charAt(j)-'0';
                int pro=dig1 *dig2;
                int pos1=i+j;
                int pos2=i+j+1;
                int sum=pro+res[pos2];
                res[pos2]=sum%10;
                res[pos1]+=sum/10; // carry
            }

        }
        StringBuilder sb=new StringBuilder();
        // for(int i=0;i<res.length;i++){
        //     if(!(sb.length()==0 && res[i]==0)){
        //         sb.append(res[i]);
        //     }
        // }
        int index=0;
        while(index<res.length && res[index]==0){
            index++;
        }
        for(int i=index;i<res.length;i++){
            sb.append(res[i]);
        }
        return sb.toString();
    }
}