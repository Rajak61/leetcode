class Solution {
    //theory -https://www.youtube.com/watch?v=UXVHeXNO9AA&ab_channel=NikhilLohia
    //code- https://leetcode.com/problems/valid-palindrome/discuss/3165353/Beats-96.9-oror-Well-Explained-Code-in-JAVA
    //time -0(n) ,space 0(1)
    public boolean isPalindrome(String s) {
      
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    
    }
}