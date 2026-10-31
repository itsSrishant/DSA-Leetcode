class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        // values are triangle only when a+b>c
        int count=0;
        int n= nums.length;
        for(int i=n-1;i>=2;i--){
            int start=0;
            int end=i-1;
            while(start<end){
                if(nums[start]+nums[end]>nums[i]){
                    count+=end-start;
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return count;
    }
}