import java.util.Scanner;
public class tcsn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip= sc.nextInt();
        if(ip<0){
            System.out.println("no");
            return;
        }

        if(ip<10 & ip>=0){
            System.out.print("yes");
            return;

        }

       
        int t=ip;
        int r=0;
        while(ip>0){
            int a=ip%10;
            r=r*10+a;
            ip/=10;



        }
        if(r==t){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    
}
