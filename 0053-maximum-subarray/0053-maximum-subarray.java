
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count = count + nums[i];
            if(count > max) {
                max = count;
            }
            if(count < 0) {
                count = 0;
            }
        }
        return max;
    }
}
