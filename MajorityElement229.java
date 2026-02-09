class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        var Frequency =new HashMap<Integer,Integer>();
        for(int i:nums){
            if(Frequency.containsKey(i)){
                Frequency.put(i,Frequency.get(i)+1);
            }
            else{
                Frequency.put(i,1);
            }
        }
        ArrayList<Integer> List1=new ArrayList<>();
        for(int i:Frequency.keySet()){
            if((Frequency.get(i))>(n/3)){
                List1.add(i);
            }
        }
        return List1;
    }
}
