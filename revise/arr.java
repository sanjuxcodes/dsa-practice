
import java.util.Scanner;
public class arr {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[]= new int[n];

        int z=0;
        int o=0;


        for(int i =0;i<n;i++){

            arr[i]=sc.nextInt();

            if(arr[i]==0){
                z++;

            }else{
                o++;
            }
        }
        int lim=Math.min(z,o);

        int l=-1;

        int lo=0;
        int hi=0;
        while(hi<n){

            int c1=0;
            int c0=0;

            while(c1<=lim && c0<=lim){

                if(arr[hi]==0){
                    c0++;
                }else{
                    c1++;

                }

                hi++;

                


            }
            if(c1==c0){
                l=Math.max(l,hi-lo+1);
            }

            lo++;



        }
        System.out.print(l);
    }
    
}
