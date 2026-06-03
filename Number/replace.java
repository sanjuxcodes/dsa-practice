import java.util.Scanner;
public class replace {

    public static void main(String[] avc){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i =0;i<ip.length();i++){
            if(ip.charAt(i) =='0'){
                sb.append('1');

            }else
                sb.append(ip.charAt(i));
        }

        System.out.println(sb.toString());

        


    }
    
}
