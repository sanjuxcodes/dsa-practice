import java.util.Scanner;
public class pttrn {

    public static void main(String[] cc){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean f=true;


        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){

                System.out.print(i);
                if(i>1 && j<i-1){
                    System.out.print("*");

                }

        }
        System.out.println();
    }

    for(int i=n;i>0;i--){
        for(int j=i;j>0;j--){
            System.out.print(i);

            if(i>1 && j>1){
                System.out.print("*");
            }

        }
        System.out.println();
    }

    }
    
}
