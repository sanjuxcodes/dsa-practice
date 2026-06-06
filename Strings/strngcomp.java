import java.util.Scanner;
public class strngcomp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String ip=sc.nextLine().replace(" ","");

        
        StringBuilder sb = new StringBuilder();
        int c=1;
        char ch=ip.charAt(ip.length()-1);
          

        for(int i=1;i<ip.length();i++){
            
            if(ip.charAt(i)==ip.charAt(i-1)){
            
                c++;
            }else

            {
                sb.append(ip.charAt(i-1));
                sb.append(c);
                c=1;
                
                
                
            }}

            sb.append(ch);
            sb.append(c);
           
            System.out.print(sb);  

        
    }
 }
    
