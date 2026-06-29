import java.util.Scanner;
public class tc {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);


        String ip= sc.nextLine();

        String parts[]= ip.split(",");

        double p=0;
        double r=0;
        double t=0;

        for(int i=0;i<parts.length;i++){
            p+=Double.parseDouble(parts[0]);
            r+=Double.parseDouble(parts[1]);
            t+=Double.parseDouble(parts[2]);

        }

        double i=(p*r*t)/100;

        System.out.printf("%.2f",i);


    }
    
}
