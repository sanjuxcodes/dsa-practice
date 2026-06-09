import java.util.Scanner;
public class date {

    public static void main(String[] aa){
        Scanner sc = new Scanner(System.in);
        String ip =sc.nextLine();
        String[] date=ip.split("-");


        int month=Integer.parseInt(date[1]);
        if(month>12){
            System.out.print("invalid");
        }

        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.print("days :"+arr[month-1]);
    }
    
}
