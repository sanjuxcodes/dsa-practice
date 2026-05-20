import java.util.Scanner;
public class monkey {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        int k=sc.nextInt();
        int j=sc.nextInt();

        if(k<=0 ||j<=0){
            System.out.println("Invalid");
            return;
        }

        int b=sc.nextInt();

        int p=sc.nextInt();


        double bb=Math.ceil(b/(double)k);

        double pp=Math.ceil(p/(double)j);



        System.out.print("Number of Monkeys left on the Tree:"+(int)(n-(bb+pp)));

 


        
    }

}

    

