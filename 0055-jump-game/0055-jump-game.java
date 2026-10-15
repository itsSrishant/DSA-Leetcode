
        
class Solution {
    public boolean canJump(int[] nums) {
        int dist = 0;
        int i = 0;
        while(i < nums.length) {

            if(i > dist) {
                return false;
            }
            if(i + nums[i] > dist) {
                dist = i + nums[i];
            }
            if(dist >= nums.length - 1) {
                return true;
            }
            i++;
        }
        return true;
    }
}

