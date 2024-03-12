class Solution {
    
    //code https://leetcode.com/problems/longest-repeating-character-replacement/discuss/91271/Java-12-lines-O(n)-sliding-window-solution-with-explanation
    //Theory=-https://www.youtube.com/watch?v=gqXU1UyA8pk&ab_channel=NeetCode
    //Time-0(n) ,space 0(1)
    public int characterReplacement(String s, int k) {
        
        int start=0;
        int maxFreq=0;
        int maxlen=0;
        int [] hm=new int[26];
        
        for(int end=0;end<s.length();end++){
            
            maxFreq=Math.max(maxFreq,++hm[s.charAt(end)-'A']);
            
        while(end-start+1-maxFreq>k){
            hm[s.charAt(start)-'A']--;
            start++;
            
        }
        
            maxlen=Math.max(maxlen,end-start+1);
            
            
        }
        return maxlen;
    }
}