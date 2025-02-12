class Solution {
    public int maximumSum(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;
        
        for (int num : nums) {
            int sumOfDigits = getDigitSum(num);
            
            if (map.containsKey(sumOfDigits)) {
                maxSum = Math.max(maxSum, map.get(sumOfDigits) + num);
                map.put(sumOfDigits, Math.max(map.get(sumOfDigits), num));
            } else {
                map.put(sumOfDigits, num);
            }
        }
        
        return maxSum;
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }  
    
}
