public class fact {
    public static void main(String[] ar){
        int n=6;
        int f=1;

       // for(int i=1;i<=5;i++){
        //    f*=i;
       // }
        System.out.println(facts(n));
    }

    static long facts(long n){
        if(n==1 ||n==0){
            return 1;

        }
        return n*facts(n-1);
    }
}
