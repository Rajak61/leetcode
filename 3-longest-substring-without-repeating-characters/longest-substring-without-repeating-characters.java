class Solution {
    public int lengthOfLongestSubstring(String s) {
     
        int start=0;
        int max=0;
        Map<Character,Integer>map=new HashMap<>();
        
        for(int end=0;end<s.length();end++){
            
            char rightChar=s.charAt(end);
            if(map.containsKey(rightChar)){
                
                start=Math.max(start,map.get(rightChar)+1);
            }
            map.put(rightChar,end);
            max=Math.max(max,end-start+1);
            
        }
        
        return max;
    }
}