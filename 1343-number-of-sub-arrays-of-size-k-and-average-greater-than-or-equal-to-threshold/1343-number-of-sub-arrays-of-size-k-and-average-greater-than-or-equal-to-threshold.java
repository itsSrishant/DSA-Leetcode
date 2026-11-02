class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int max = k * threshold;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum >= max) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum >= max) {
                count++;
            }
        }
        return count;
    }
}