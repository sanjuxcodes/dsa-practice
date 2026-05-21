import java.util.*;
public class twist {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String vow="aeiouAIEOU";

        String ip1=sc.nextLine();
        String ip2=sc.nextLine();
        String ip3=sc.nextLine().toUpperCase();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();


        int i=0;
        while(i<ip1.length()){

            char ch=ip1.charAt(i);

            if(vow.indexOf(ch)!= -1){

                sb.append("%");              

            }else
            {
                sb.append(ch);
            }
            i++;


            
        }
        int j=0;

        while(j<ip2.length()){
            char ch=ip2.charAt(j);

            if(vow.indexOf(ch)==-1){
                sb1.append("#");
            }
            else{
                sb1.append(ch);
            }
            j++;


        }

        System.out.println(sb.toString()+sb1.toString()+ip3);



    }
    
}
