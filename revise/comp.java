import java.util.Scanner;
public class comp {
    public static void main(String[] ar){


        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();
        StringBuilder sb= new StringBuilder();

        

        for(int i=0;i<ip.length();i++){

        int c=1;
            
         
           
            char ch= ip.charAt(i);
       
            while(i<ip.length() -1&& ch==ip.charAt(i+1)){

                c++;
                i++;

            }
            sb.append(ch);
            sb.append(c);

       
            
        }
        //sb.append(ip.charAt(ip.length()-1));
        //sb.append(1);
        
       
        
        
        System.out.print(sb.toString());
        
    }
    
}
