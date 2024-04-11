class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(char c: t.toCharArray()) tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        int size = 0;
        int i = 0;
        String ans = "";
        for(int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (tMap.get(c) == null) continue;
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            if (sMap.get(c).intValue() == tMap.get(c).intValue()) size++;
            while(size == tMap.size()) {
                if (ans.isEmpty() || j - i + 1 < ans.length()) ans = s.substring(i, j + 1);
                char c1 = s.charAt(i);
                if (sMap.get(c1) != null) {
                    sMap.put(c1, sMap.get(c1) - 1);
                    if (sMap.get(c1).intValue() < tMap.get(c1).intValue()) size--;
                    if (sMap.get(c1) == 0) sMap.remove(c1);
                }
                i++;
            }
        }
        return ans;
    }
}