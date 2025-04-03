class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long maxvalue=0;
        int maxbeforej=nums[0];
        for (int j=1;j<n;j++){
            maxbeforej=Math.max(maxbeforej,nums[j-1]);
            if(maxbeforej>nums[j]){
                for(int k=j+1;k<n;k++){
                    long value=(long)(maxbeforej - nums[j]) * nums[k];
                    maxvalue=Math.max(maxvalue,value);
                }

            }

        }
        return maxvalue;


        
    }
}
