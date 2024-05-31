class Solution {
    //Time -0(n2), space-0(1)
    //theory and code- https://www.youtube.com/watch?v=pp8K5C2hMr4
    // https://walkccc.me/LeetCode/problems/647/#__tabbed_1_2
    public int countSubstrings(String s) {
         int res=0;
        
        if(s.length()==0){
            
            return 0;
        }
        
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            
            //even and odd call
            res+=isPalindrome(i,i,s);//even
            res+=isPalindrome(i,i+1,s);//odd
        }
     return res;   
    }
    
    public int isPalindrome(int l,int r, String s){
      int count=0;  
       while (l >= 0 && r < s.length() && s.charAt(l--) == s.charAt(r++)) {
            count++;
        }
        
        return count;
    }
}