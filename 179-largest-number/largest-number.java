class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                String ab=arr[j]+arr[j+1];
                String ba=arr[j+1]+arr[j];
                if((ab).compareTo(ba)<0){  // bubble sort
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        if(arr[0].equals("0")) return "0";
        String result="";
        for(String s:arr){
                result+=s;
            }
        return result;
    }
}