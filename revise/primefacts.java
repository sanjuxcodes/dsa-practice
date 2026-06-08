import java.util.Scanner;


public class primefacts {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x=n;
        boolean f=true;



        for(int i=2;i*i<= n;i++){

            while(n%i ==0){

                if(!f){
                    System.out.print("x");
                }
              
              System.out.print(i);
              f=false;
                n=n/i;
            }


        }
      








    }
    
}
