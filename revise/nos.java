import java.util.Scanner;
public class nos {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        String ip= sc.nextLine();

        char sign=ip.charAt(0);
        int n=Integer.valueOf(ip.replaceAll("-",""));

        boolean s=true;


        if (sign=='-'){
            s=false;


        }

        int sum=0;
        int r=0;



        while(n>0){

            int d=n%10;
            r=r*10+d;
            sum+=d;
            n/=10;
            


        }
        if(s){
            System.out.println(r);

        }else
            System.out.println("-"+r);
        

        System.out.print("sum: "+sum);

    }
    
}
