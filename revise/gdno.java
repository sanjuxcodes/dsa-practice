import java.util.Scanner;
public class gdno {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ip= sc.nextLine();
        boolean o=true;
        boolean e=true;

        for(int i=0;i<ip.length();i++){
            int n=(ip.charAt(i) -'0');

            if(i%2==0 && n%2 != 0){
                e=false;
                break;
            }
            if(i%2 !=0 && n%2 == 0){
                o=false;
                break;
            }
        }

        if(o &&e){
            System.out.print("Good no");
            return;

        }else{
            System.out.print("not a good no");
        }

    }
    
}
