
import java.util.Arrays;
import java.util.Scanner;

public class prefix {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();
        String[] arr=s.split(",");

        Arrays.sort(arr);
        String res="";

        StringBuilder sb= new StringBuilder();



        char[] frst=arr[0].toCharArray();
        char[] last=arr[arr.length-1].toCharArray();
        
        for(int i =0 ;i<arr.length;i++){
            if(frst[i]!= last[i]){
                sb.append(" ");
                break;
            }

            sb.append(frst[i]);

        }

    
    
           for(char ch : sb.toString().toCharArray()){
            System.out.print(ch);
           }
    }
    
}
