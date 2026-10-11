class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num[] = new int[m + n];
        for (int i = 0; i < (m + n); i++) {
            if (i < m) {
                num[i] = nums1[i];
            } else {
                num[i] = nums2[i - m];
            }
        }

        for (int i = 0; i < (m+n - 1); i++) {

            int min = i;

            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }

            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }

        for(int i=0; i< num.length; i++){
            nums1[i]=num[i];
        }
    }
}