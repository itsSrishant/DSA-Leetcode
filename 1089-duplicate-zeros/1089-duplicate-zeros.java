
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(k >= arr.length) {
                break;
            }
            temp[k] = arr[i];
            k++;
            if(arr[i] == 0 && k < arr.length) {
                temp[k] = 0;
                k++;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
