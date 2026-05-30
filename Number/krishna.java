import java.util.*;



public class krishna {

    static int fact(int n){

        if(n==1 || n==0){
            return 1;
        }

     int b=1;



        for(int i=2;i<=n;i++){
            b=i*b;


        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m= sc.nextInt();

       int r=0;

       int n=m;

       while(n>0){

        int x = n%10;
        r+=fact(x);
        n/=10;

        
       }
       if(r==m){
        System.out.println("yes");
        return;
       }else{
        System.out.println("no");
        return;
       }





    }
    
}
