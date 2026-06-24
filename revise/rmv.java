import java.util.Scanner;
public class rmv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ip= sc.nextLine().replaceAll("[^a-zA-z]","");
        String part= sc.nextLine();

        StringBuilder sb =new StringBuilder(ip);


        while(sb.indexOf(part) !=-1){
            sb.delete(sb.indexOf(part),sb.indexOf(part)+part.length());

        }

        System.out.print(sb.toString());





    }
}
