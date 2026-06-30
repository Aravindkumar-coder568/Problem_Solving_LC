class Solution {
    static String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void possibleCombination(String s,String ans,List<String> li){
        if(s.length()==0){
            li.add(ans);
            return;
        }

        String key=keypad[s.charAt(0)-48];   // 48 for like 'a' , this is for number
        for(int i=0;i<key.length();i++){
            possibleCombination(s.substring(1),ans+key.charAt(i),li);
        }
    }
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        List<String> li=new ArrayList<>();
        possibleCombination(digits,"",li);
        return li;
    }
}