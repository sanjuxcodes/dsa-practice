class Solution {
    public int minFlips(int a, int b, int c) {
        int f=0;

        while(a>0 || b>0 ||c>0){
            int ai= a&1;
            int bi=b&1;
            int ci=c&1;

            if(ci==0){

                f=f+ai+bi;

            }
            else{
                if(bi==0 && ai==0){
                    f+=1;
                }
            }
            a>>=1;
            b=b>>1;
            c>>=1;

        }
        return f;
    }
}