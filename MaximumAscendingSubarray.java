class Solution {
    public int maxAscendingSum(int[] nums) {
        int Maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currentsum+=nums[i];
            }
            else{
                Maxsum=Math.max(Maxsum,currentsum);
                currentsum=nums[i];
            }
        }
        return Math.max(Maxsum,currentsum);
        
    }
}
