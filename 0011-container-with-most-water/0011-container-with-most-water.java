class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int globalarea=0;
        while(start<=end){
            int localarea=0;
            if(height[start]>height[end]){
                localarea= (end-start)*height[end];
                end--;
            }
            else{
                localarea= (end-start)*height[start];
                start++;
            }
            globalarea= Math.max(localarea,globalarea);
        }
        return globalarea;
    }
}