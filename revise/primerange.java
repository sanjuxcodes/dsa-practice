import java.util.Scanner;
public class primerange {

    static boolean isprime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
                
            }
            
        }
        return true;
    }
    static void pr(int a,int b){

        for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }

    }
    static void sum(int a , int b){

        int sum=0;

        for(int i=a;i<=b;i++){
            if(isprime(i)){
                sum+=i;
            }
        }
        System.out.print(sum);


    }
    static int near(int a){
        for(int i=1;i<=a;i++){
            if(isprime(a-i)){
                return a-i;
            }
            if(isprime(a+i)){
                return a+i;
            }
        }
        return -1;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int f=sc.nextInt();
        int l = sc.nextInt();

        sum(f,l);



    }


    
}
