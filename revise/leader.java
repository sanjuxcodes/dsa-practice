import java.util.Scanner;
public class leader {


    public static void main(String[] argd){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        

        int max=-1;
    

    for(int i=n-1;i>=0;i--){

        if(arr[i]>max){
            max=arr[i];
            System.out.print(arr[i]);
        }


    }




    }
    
}
