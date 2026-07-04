import java.util.Scanner;

public class gfg7 {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String str1= sc.nextLine();

        String str2=sc.nextLine();

        StringBuilder sb = new StringBuilder();
                
        for(char ch : str1.toCharArray()){
                    if(str2.indexOf(ch)==-1){
                        sb.append(ch);
                    }
                }
                
                System.out.print(sb.toString());
            
            }

   
}
