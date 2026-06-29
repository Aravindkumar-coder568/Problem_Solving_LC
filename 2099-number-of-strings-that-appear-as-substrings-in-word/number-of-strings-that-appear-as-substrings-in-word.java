class Solution {
    // public static int isContains(,String sub){
    //     int n= arr.length;
    //     for(int i=0;i<n;i++){

    //     }
    // }
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : patterns) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count=0;
        int index=0;
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                String sub=word.substring(i,j);
                if(map.containsKey(sub)){
                    count+=map.get(sub);
                    map.remove(sub);
                }
            }
        }
        
        return count;

    }
}