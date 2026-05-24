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
static void near(int n){

    for(int i=1;i<n;i++){
        
        if(isprm(n-i)){
            System.out.println(n-i);
            return;
        }
        else if( isprm(n+i)){
            System.out.println(n+i);
            return;
        }
       
    }
    System.out.println("no prime");
    }


static void twins(int n){
    for(int i=2;i<=n-2;i++){
        if(isprm(i) && isprm(i+2)){
            System.out.println(i + " "+(i+2));
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

   
        int r=sc.nextInt();

        int sum=0;

       // for(int i=2;i<=r;i++){
            //if(isprm(i)){
             //   sum+=i;
             //   System.out.println(i);
             
           // }
       // }

       // System.out.println("sums :"+sum);

     //twins(r);
near(r);



        
    }
    
}
