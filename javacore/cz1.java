import java.util.Scanner;
public class cz1 {
    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int arr [] = new int[n];
        

        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();


        }
        int c=0;
        for(int i =0;i<n-2;i++){

            if(arr[i]+arr[i+2] == arr[i+1]){
                c++;
            }

        }
        System.out.print(c);


    }
    
}
