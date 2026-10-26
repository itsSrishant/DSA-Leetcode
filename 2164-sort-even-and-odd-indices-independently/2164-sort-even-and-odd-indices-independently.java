class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int odd[]=new int[n/2];
        int even[] = new int[(n+1)/2];
        int k=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[k]=nums[i];
                k++;
            }
            if(i%2==1){
                odd[j]=nums[i];
                j++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int start=0;
        int end= odd.length-1;
        while(start<end){
            int temp=odd[start];
            odd[start]=odd[end];
            odd[end]=temp;
            end--;
            start++;
        }
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[a];
                a++;
            }
            else{
                nums[i]=odd[b];
                b++;
            }
        }
        return nums;
    }
}