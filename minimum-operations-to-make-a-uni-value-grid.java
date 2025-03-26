class Solution {
    public int minOperations(int[][] grid, int x) {
      List<Integer> nums = new ArrayList<>();
        int m = grid.length, n = grid[0].length;
        
       
        for (int[] row : grid) {
            for (int num : row) {
                nums.add(num);
            }
        }
        int remainder = nums.get(0) % x;
        for (int num : nums) {
            if (num % x != remainder) {
                return -1; 
            }
        }
        
        Collections.sort(nums);
        int median = nums.get(nums.size() / 2);
        int operations = 0;
        for (int num : nums) {
            operations += Math.abs(num - median) / x;
        }
        
        return operations;  
    }
}
