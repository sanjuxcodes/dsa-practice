class Solution {
    public int numOfSubarrays(int[] arr) {
        
        
        int c=0;

        for(int i=0;i<arr.length;i++){
            int j=i;
            int sum=0;
            while(j<arr.length){
                sum+=arr[j];
                if((sum & 1)==1){
                    c++;
                }
                j++;

            }


        }
        return c;
        
    }
}