
import java.util.Scanner;


public class tcspp {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        int r = sc.nextInt();

        if(r==0){
            System.out.println(0);
            return;
            
        }

        long sum=0;

        for(int i=0;i<num.length();i++){
        sum+=num.charAt(i)-'0';}
        long res= sum*r;

       
        while(res>9){
            long temp=0;
            

            while(res>0 ){
                temp+=res%10;
                res=res/10;

            }
            res=temp;

           
           

        }
      

        System.out.println(res);

    

    }

    
}
