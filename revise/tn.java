public class tn {

    static boolean isprm(int n){
        if(n<2){
            return false;

        }
        if(n==2){
            return true;

        }

        for(int i=2;i*i<=n;i++){
            if(n%i ==0){
                return false;
            }

        }
        return true;



        

    }

    static void range(int n){
    boolean f=true;
    
        for(int i=2;i<=n;i++){

            if(isprm(i)){
                if(f){
                    System.out.print(i);
                f=false;
                continue;
            }
            System.out.print(" "+i);

            }

        }
    }
   // static int primes(int n){


   static void facts(int n){

    int max=1;

    while(n%2==0){
        max=2;
        n/=2;
        System.out.print(2+"x");
    }

    for(int i =3;i*i<=n;i+=2){
      
        while(n%i ==0){
           // System.out.print(i+"X");
            n/=i;
            max=i;
            System.out.print(i+"x");

        }

        
        

    }
    if (n > 2) {
        max = n;
        System.out.print(n);
    }
    
    //System.out.print("large: "+max);

   }
        
    
    public static void main(String[] ar){


       // System.out.print(isprm(2));
        //range(20);

        facts(100);

    }
}
