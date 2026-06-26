import java.util.Scanner;
public class movez {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]=new int[n];

      

        int j=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

            if(arr[i] !=0){
                arr[j]=arr[i];
                j++;
            }


        }
        for(int i=j;i<n;i++){

            arr[i]=0;


        }
        for(int i: arr){
            System.out.print(i+" ");
        }


    }
    
}
