import java.util.Scanner;
public class scnd {


    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){

            int r= sc.nextInt();
            for(int i=1;i<=r;i++){
                for(int j=0;j<i;j++){
                    System.out.print(j+1);

                }
                System.out.println();
            }
            





            t--;
        }
    }
    
}
