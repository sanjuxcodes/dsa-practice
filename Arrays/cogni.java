
import java.util.*;
class cogni{
    static boolean isprm(long x){
        if(x<2){
            return false;
        }
        else if(x==2){
            return true;
        }
        
        else{
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                    return false;
                }
                
            }
        }
        return true;
    }
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        if(n<3) {
            System.out.print(-1);

        }

        long arr[]= new long[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();

        }
        int xx=0;

        for(int i=1;i<n-1;i++){

            if(isprm(arr[i-1]) && isprm(arr[i+1])){
                System.out.print(arr[i]);
                xx++;
                break;
            }}
                if(xx==0) System.out.print(-1);


        

        
    }
}