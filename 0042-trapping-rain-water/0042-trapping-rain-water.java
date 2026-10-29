class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int lmax=0,rmax=0, water=0;
        while(start<=end){
            if(height[start]<=height[end]){
                if(height[start]>=lmax){
                    lmax=height[start];
                }
                else{
                    water=water + lmax - height[start];
                }
                start++;
            }
            else{
                if(height[end]>=rmax){
                    rmax=height[end];
                }
                else{
                    water=water + rmax - height[end];
                }
                end--;
            }
        }
        return water;
    }
}