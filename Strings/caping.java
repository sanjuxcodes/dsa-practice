import java.util.*;
class cg{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip= sc.nextLine();

        int n=ip.length();


        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
           

            if(i==0 || i==n-1){
                
                sb.append(Character.toUpperCase(ip.charAt(i)));
                continue;
                

            }
          
            
            else if(Character.isWhitespace(ip.charAt(i-1))){
             
                sb.append(Character.toUpperCase(ip.charAt(i)));
                




                
            }
            else if(Character.isWhitespace(ip.charAt(i+1))){
                sb.append(Character.toUpperCase(ip.charAt(i)));
              
                
            }else
                sb.append(ip.charAt(i));



            }

            System.out.print(sb.toString());
    }

}
    

