import java.util.Scanner;
public class pass {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        if(ip.length()<8){
            System.out.print("Invalid");
            return;

        }
        int u=0;
        int l=0;
        int d=0;
        int sp=0;

        for(char ch : ip.toCharArray()){
            if(Character.isUpperCase(ch)){
                u++;

            }
            if(Character.isLowerCase(ch)){
                l++;

            }
            if(Character.isDigit(ch)){
                d++;

            }
            if(Character.isWhitespace(ch)){
                System.out.print("Invalid")
;return;
            }
            if(!Character.isLetterOrDigit(ch)){
                sp++;


            }
        }

        if(u>=1 && l>=1 && sp>=2 && d>=1){
            System.out.print("Valid");
            return;

        }else{
            System.out.print("Invalid");
        }
    }
    
}
