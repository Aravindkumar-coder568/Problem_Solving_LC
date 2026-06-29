class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        // HashMap<String, Integer> map = new HashMap<>(); -
        // for (String s : patterns) {                        
        //     map.put(s, map.getOrDefault(s, 0) + 1);
        // }
        // int count=0;
        // int index=0;                                       => It's also correct 
        // for(int i=0;i<word.length();i++){                   
        //     for(int j=i+1;j<=word.length();j++){              
        //         String sub=word.substring(i,j);
        //         if(map.containsKey(sub)){
        //             count+=map.get(sub);
        //             map.remove(sub);
        //         }
        //     }
        // }
        int count=0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        
        return count;

    }
}