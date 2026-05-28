import java.util.Scanner;
public class hndshk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n = sc.nextInt();

            if(n==1){
                System.out.println(1);
                break;

            }

            System.out.println((n*(n-1))/2);
            
            t--;

        }
    }
    
}
