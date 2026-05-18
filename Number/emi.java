
import java.util.*;

class emi{
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int p=sc.nextInt();
        int t=sc.nextInt();
        int n=sc.nextInt();

        int dc=0;
        
        double r[]=new double[n];
        int pr[]=new int[n];
        double emia=0;
        double emib=0;

  

        for(int i=0;i<n;i++){

            pr[i]=sc.nextInt();
            r[i]=sc.nextDouble();



        }

        int n2=sc.nextInt();

        double r2[]=new double[n2];
        int pr2[]=new int[n2];

        for(int i=0;i<n2;i++){

            pr2[i]=sc.nextInt();
            r2[i]=sc.nextDouble();



        }
        //EMI = loanAmount * monthlyInterestRate / ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))

        for(int i=0;i<n;i++){
            
            double mr=r[i]/1200;

            int mn=12*pr[i];


            emia+=((p*mr)/(1-1/Math.pow(1+mr,mn)))*mn;




        }
        for(int i=0;i<n2;i++){
            
            double mr=r2[i]/1200;

            int mn=12*pr2[i];


            emib+=((p*mr)/(1-1/Math.pow(1+mr,mn)))*mn;




        }

        if(emia<emib){
            System.out.println("Bank A");

        }else   
            System.out.println("Bank B");



        
        

      
        
    }
}