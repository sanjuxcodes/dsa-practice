import java.util.Scanner;
public class flsearch {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int t=sc.nextInt();
        int f=-1;
        int l=-1;

        for(int i =0;i<n;i++){

            if(t==arr[i] && f==-1){
                f=i;

            }
            if(t==arr[i]){
                l=i;
            }



        }
        System.out.print(f +" "+l);
    }
    
}
