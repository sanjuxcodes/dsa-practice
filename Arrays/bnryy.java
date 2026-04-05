import java.util.Scanner;
public class bnryy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        String bnry=Integer.toBinaryString(n);
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<bnry.length();i++){

            if(bnry.charAt(i)=='0'){
                sb.append("1");
            }
            if(bnry.charAt(i)=='1'){
                sb.append("0");

            }

        }
        String res= sb.toString();

        int f=Integer.parseInt(res,2);
        System.out.println(f);
        

    }
    
}
