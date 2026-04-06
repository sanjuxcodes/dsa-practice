import java.util.Scanner;
public class days {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter curr day: ");
        String day=sc.nextLine().toLowerCase();

        System.out.println("enter rem day : " );
        int rd= sc.nextInt();

        int d=0;

        switch (day) {
            case "mon":d=1;break;
            case "tue":d=2;break;
            case "wed":d=3;break;
            case "thu":d=4;break;
            case "fri":d=5;break;
            case "sat":d=6;break;
            case "sun":d=7;break;

            default:
                throw new AssertionError();
        }
        int c=0;

        while(rd>=0){
            
            if(d%7==0){
                c++;


            }
            
            d=(d%7)+1;
            rd--;
        }
        System.out.print(c);


        
        
    }
    
}
