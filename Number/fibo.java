import java.util.*;
public class fibo {

    static void  fibo(int n){
        int a=0;
        int b=1;
        System.out.print(a + " "+b);
        for(int i=2;i<=n;i++){
            System.out.print(" "+(a+b));
            int x=a+b;
            a=b;
            b=x;
        }
       

       







    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fibo(n);
        

       
    }
    
}
