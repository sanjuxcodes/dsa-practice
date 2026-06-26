import java.util.Scanner;
public class seclar {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);


        int n=sc.nextInt();




        int arr[]= new int[n];
        

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int x= arr[n-1];


        for(int i =1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i-1]);
            }
        }
        System.out.print(x);





       
        


    }
}
