class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> productCount = new HashMap<>();
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];

                count += 8 * productCount.getOrDefault(product, 0);

                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        return count;
    
    }
}
