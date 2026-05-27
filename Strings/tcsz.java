import java.util.Scanner;
public class tcsz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip= sc.nextLine();
        StringBuilder sb = new StringBuilder();

        int freq[]= new int[128];

        for(int i =0;i<ip.length();i++){
            freq[ip.charAt(i)]++;
            if(freq[ip.charAt(i)]==1){
                sb.append(ip.charAt(i));
            }

        }
        System.out.print(sb.toString());

    
        
    }
    
}
