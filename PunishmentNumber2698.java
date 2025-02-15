class Solution {
    private static boolean canPartition(String numStr, int target, int index, int currentSum) {
        if (index == numStr.length()) {
            return currentSum == target;
        }
        
        for (int i = index + 1; i <= numStr.length(); i++) {
            int part = Integer.parseInt(numStr.substring(index, i));
            if (canPartition(numStr, target, i, currentSum + part)) {
                return true;
            }
        }
        
        return false;
    }
    public int punishmentNumber(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String squareStr = String.valueOf(square);

            if (canPartition(squareStr, i, 0, 0)) {
                sum += square;
            }
        }

        return sum;
    }
}
