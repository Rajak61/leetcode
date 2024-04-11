class Solution {
    //theory and code -https://www.youtube.com/watch?v=jSto0O4AJbM&ab_channel=NeetCode
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }

        // Initialize the count of characters in t
        HashMap<Character, Integer> countT = new HashMap<>();
        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have = 0, need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;
        int l = 0;

        // Slide the window
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (countT.containsKey(c)) {
                countT.put(c, countT.get(c) - 1);
                if (countT.get(c) == 0) {
                    have++;
                }
            }

            // Shrink the window
            while (have == need) {
                // Update the result
                if (r - l + 1 < resLen) {
                    res[0] = l;
                    res[1] = r;
                    resLen = r - l + 1;
                }

                char leftChar = s.charAt(l);
                if (countT.containsKey(leftChar)) {
                    countT.put(leftChar, countT.get(leftChar) + 1);
                    if (countT.get(leftChar) > 0) {
                        have--;
                    }
                }
                l++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}

