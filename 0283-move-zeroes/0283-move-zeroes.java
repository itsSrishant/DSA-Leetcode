class Solution {
    public void moveZeroes(int[] nums) {
        int j=nums.length-1;
        int k=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[j]=nums[i];
                j--;
            }
            else{
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}