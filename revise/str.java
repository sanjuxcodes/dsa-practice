
import java.util.Scanner;
public class str {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();


        String[] word=ip.split(" ");

        StringBuilder sb = new StringBuilder();
        int i=0;


        for(String w : word){
            //StringBuilder sbb = new StringBuilder();

            //sbb.append(w);
            //sbb.reverse();

           
            //if(i!=0){
                //sb.append( " "+sbb);


            //}else
                //sb.append(sbb);
            //i++;
            if(i>0)
                System.out.print(" ");

            for(int j=w.length()-1;j>=0;j--){

                System.out.print(w.charAt(j));


            }
           
            i++;




        }

        System.out.print(sb.toString());
    
    
    }
    
}
