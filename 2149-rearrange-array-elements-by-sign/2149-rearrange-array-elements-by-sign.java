class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr1[]=new int[nums.length/2];
        int j=0;
        int k=0;
        int arr2[]=new int[nums.length/2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr1[j]=nums[i];
                j++;
            }
            if(nums[i]<0){
                arr2[k]=nums[i];
                k++;
            }
        }
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i]=arr1[a];
                a++;
            }
            if(i%2==1){
                nums[i]=arr2[b];
                b++;
            }
        }
        return nums;
    }
}