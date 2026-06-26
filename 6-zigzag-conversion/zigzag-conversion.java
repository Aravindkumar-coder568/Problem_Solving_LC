class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(n==1 || numRows>n) return s;
        List<List<Character>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            res.add(new ArrayList<>());
        }
        int index=0;
        while(index!=n){
            for (int i = 0; i < numRows && index<n;i++) {
                res.get(i).add(s.charAt(index));
                index++;
            }
            for (int i = numRows - 2; i >= 1 && index<n;i--) {
                res.get(i).add(s.charAt(index));
                index++;
            }

        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                sb.append(res.get(i).get(j));
            }
        }
        return sb.toString();
        
    }
}