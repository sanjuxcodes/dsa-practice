class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;

        }
       boolean isprm[]= new boolean[n];

       for(int i=2;i<n;i++){
        isprm[i]=true;
       }

       isprm[0]=false;
       isprm[1]=false;

       for(int i=2;i<= Math.sqrt(n);i++){
        if(isprm[i]){
        for(int j= i*i;j<n;j+=i){
            isprm[j]=false; //eliminate all the multiple of i 
        }}}
        int c=0;
        for(int i=2;i<n;i++){
            if(isprm[i]){
                c++;
            }
        }

        return c;
       }
    }
