import java.util.Scanner;
public class prime {


 static boolean isprm(int n){

    if(n<=1){
        return false;
    }
    

        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
  
                return false;
               
            }
        }
            
     
   return true;
        
 
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

   
        int r=sc.nextInt();

        int sum=0;

        for(int i=2;i<=r;i++){
            if(isprm(i)){
                sum+=i;
                System.out.println(i);
             
            }
        }

        System.out.println(sum);




        
    }
    
}
