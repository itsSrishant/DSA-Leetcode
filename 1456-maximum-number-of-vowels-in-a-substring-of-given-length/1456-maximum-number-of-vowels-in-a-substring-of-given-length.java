class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            char remove=s.charAt(i-k);
            char add=s.charAt(i);
            if(remove=='a' || remove=='e'|| remove=='i' || remove=='o' || remove=='u'){
                count--;
            }
            if(add=='a' || add=='e'|| add=='i' || add=='o' || add=='u'){
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}