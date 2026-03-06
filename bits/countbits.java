class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i]=arr[i>>1]+(i&1); //fristly array was empty in idx 1 its 1 then from it other will be filled
        }
        return arr;
    }
}