class Solution {
    public long countBadPairs(int[] nums) {
       Map<Integer, Integer> freqMap = new HashMap<>();
        long totalPairs = 0, goodPairs = 0;
        int n = nums.length;
        
        for (int j = 0; j < n; j++) {
            int diff = nums[j] - j;
            if (freqMap.containsKey(diff)) {
                goodPairs += freqMap.get(diff);
            }
            
            freqMap.put(diff, freqMap.getOrDefault(diff, 0) + 1);
        }
        
        totalPairs = (long) n * (n - 1) / 2;
         return totalPairs - goodPairs;
    }
}
