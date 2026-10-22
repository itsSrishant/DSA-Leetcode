class Solution {
    public int jump(int[] nums) {
        int end=0;
        int max=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>max){
                max=i+nums[i];
            }
            if(end==i){
                end=max;
                count++;
            }
        }
        return count;
    }
}