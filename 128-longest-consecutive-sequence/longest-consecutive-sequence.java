class Solution {
    public int longestConsecutive(int[] nums) {
        

		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], true);
		}

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i] - 1)) {
				map.put(nums[i], false);
			}
		}

		int max = 0;

		for (Integer key : map.keySet()) {
			if (map.get(key) == true) {
				max = Math.max(max, findlength(map, key));
			}

		}
			 
		return max;

	
    }
    private  int findlength(HashMap<Integer, Boolean> map, Integer key) {
		int ans=0;
		
		while(map.containsKey(key)){
			key++;
			ans++;
		}
		return ans;
	}
}