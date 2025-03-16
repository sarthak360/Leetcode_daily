class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1, right = (long) ranks[0] * cars * cars; 
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (canRepairAllCars(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }

    private boolean canRepairAllCars(int[] ranks, int cars, long maxTime) {
        int repairedCars = 0;
        for (int rank : ranks) {
            repairedCars += Math.sqrt(maxTime / rank); 
            if (repairedCars >= cars) return true; 
        }
        return false;
    }
}
