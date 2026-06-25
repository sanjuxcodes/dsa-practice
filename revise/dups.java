import java.util.Scanner;
public class dups {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int j=1;

        int i=0;
        while(j<n){

            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];

            }
            j++;
        }
       // while(i<n-1){
            //arr[++i]=0;

        //}
        for(int ii=0;ii<i+1;ii++){
            System.out.print(arr[ii]+ " ");

        }
    }
    
}
