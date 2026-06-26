import java.util.Scanner;
public class fibo {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n==0){
            System.out.print(0);
            return;

        }


        int a=0;
        int b=1;
        System.out.print(a + " ");
        System.out.print(b+" ");
        boolean frst= true;

        while(true){
           
            int c=a+b;
            a=b;
            b=c;
            if(b>n){
                return;
            }
            if(!frst){
                System.out.print(" ");
            }
            System.out.print(b);
            frst=false;
        }

       
    }
    
}
