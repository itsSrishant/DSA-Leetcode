class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int val=0;
        int k=1;
        for(int i=2;i<nums.length;i=i+2){
            if(nums[k]!=nums[i]){
                val=nums[i];
            }
            k=k+2;
        }
        if(val==0){
            val=nums[0];
        }
        return val;
    }
}