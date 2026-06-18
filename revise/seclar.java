import java.util.Scanner;
public class seclar {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);



        String ip = sc.nextLine().replaceAll(" ","");

        char ch= ip.charAt(ip.length()-1);

        

        for(int i =1;i<ip.length();i++){

            if(ip.charAt(i) !=ip.charAt(i-1)){
                System.out.print( ip.charAt(i-1));




            }
            
            


        }
        System.out.print(ch);
        


    }
}
