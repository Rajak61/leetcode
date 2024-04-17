class Solution {
    //time 0(m*n) ,space 0(n)
    //theory -https://www.youtube.com/watch?v=C9V66KyZCP8&ab_channel=NikhilLohia
    //code-https://leetcode.com/problems/group-anagrams/discuss/19176/Share-my-short-JAVA-solution
    public List<List<String>> groupAnagrams(String[] strs) {
         if (strs == null || strs.length == 0){
          return new ArrayList<>();
         }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) {
            ca[c - 'a']++;
            }
            //String keyStr = String.valueOf(ca);// this is first way
            
            String keyStr = getFreqCount(s);// this is second way
            if (!map.containsKey(keyStr)) {
            map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    	public String getFreqCount(String s){
	
		//req bucket
		
		int[] freq=new int[26]; // use above char array or here int array
		
		for(char ch:s.toCharArray()){
			
			freq[ch-'a']++;
			
		}
		char c='a';
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<freq.length;i++){
			sb.append(c);
			sb.append(freq[i]);
			
		}
		return sb.toString();
	}
    
}