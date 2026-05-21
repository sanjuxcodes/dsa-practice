import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().toLowerCase().charAt(0);
        int n = sc.nextInt();

        switch (ch) {

            // Coffee
            case 'c':

                switch (n) {

                    case 1:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Espresso Coffee!");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Cappuccino Coffee!");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Latte Coffee!");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;

            // Tea
            case 't':

                switch (n) {

                    case 1:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Plain Tea!");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Assam Tea!");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Ginger Tea!");
                        break;

                    case 4:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Cardamom Tea!");
                        break;

                    case 5:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Masala Tea!");
                        break;

                    case 6:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Lemon Tea!");
                        break;

                    case 7:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Green Tea!");
                        break;

                    case 8:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Organic Darjeeling Tea!");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;

            // Soup
            case 's':

                switch (n) {

                    case 1:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Hot and Sour Soup!");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Veg Corn Soup!");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Tomato Soup!");
                        break;

                    case 4:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Spicy Tomato Soup!");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;

            // Beverages
            case 'b':

                switch (n) {

                    case 1:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Hot Chocolate Drink!");
                        break;

                    case 2:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Badam Drink!");
                        break;

                    case 3:
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Badam-Pista Drink!");
                        break;

                    default:
                        System.out.println("INVALID OUTPUT!");
                }
                break;

            default:
                System.out.println("INVALID OUTPUT!");
        }
    }
}