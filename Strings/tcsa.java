import java.util.Scanner;
public class tcsa {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String ip=sc.nextLine().trim();

        


        if(ip.length()<=1){
            System.out.print(ip);
        }

        String[] arr=ip.split("\\s+");


        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            if(i != 0){
                sb.append(" ");
            }
        }

        System.out.print(sb.toString());







    }
    
}
