class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i;j<nums.length;j++){
                count=count*nums[j];
                if(count>max){
                    max=count;
                }
            }
        }
        return max;
    }
}