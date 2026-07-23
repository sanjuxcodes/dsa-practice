

import java.util.HashMap;
import java.util.Scanner;
public class cz8 {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        int arr[]= new int[4];
        HashMap<Integer,Character> map = new HashMap<>();

        

        for(int i =0;i<4;i++){
            arr[i]=sc.nextInt();
       

        }

        for(int i=0;i<4;i++){
            System.out.println(arr[i]+"-"+(char)arr[i]);
        




    }
    
}
}