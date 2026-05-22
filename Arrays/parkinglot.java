import java.util.Scanner;
public class parkinglot {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();
        sc.nextLine();


       
        int [][] arr= new int[r][c];
        String ip=sc.nextLine();
        String[] part= ip.split(",");


        
        int idx=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=Integer.parseInt(part[idx]);
                idx++;

            }
        }
        int ans=0;

        int max=Integer.MIN_VALUE;


        for(int i=0;i<r;i++){
            int o=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    o++;


                   

                    if(max<o){
                        ans=i;


                    }
                    max=Math.max(o,max);

                    

                }

            }
        }
        if(ans==0){
            System.out.println("all parkings are empty");
            return;
        }

        System.out.println(ans+1);


        



    }
    
}
