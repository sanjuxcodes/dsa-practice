import java.util.Scanner;

public class cz7{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read inputs
        double li = sc.nextDouble();
        double dis = sc.nextDouble();

        // Check invalid input
        if (li <= 0 || dis <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        double lans = (li / dis) * 100;


        double dd= dis*0.6214;
        double ii= li*0.2642;

        double a=dd/ii;

        System.out.printf("%.2f%n", lans);
        System.out.printf("%.2f", a);

        
    }
}