import java.util.Scanner;
public class stra {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ip=sc.nextLine();

        String mp=sc.nextLine();

        if(mp.length()!=ip.length()){
            System.out.print("no");
        }


        String op=ip+ip;

        if(op.contains(mp)){
            System.out.print("yes");
        }else{
            System.out.print("No");
        }



    }
    
}
