import java.util.Scanner;
public class rshft {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);




        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sc.nextLine();
       
        int d=sc.nextInt();
        d=d%n;


        int temp[]= new int[d];
        int t=0;

        for(int i=n-d;i<n;i++){
            temp[t]=arr[i];
            t++;
        }
        int j=n-1;
        for(int i=n-d-1;i>=0;i--){
            arr[j]=arr[i];
            j--;
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }

        for(int i :arr){
            System.out.print(i+" ");
        }

    }
    
}
