import java.util.Scanner;
public class res {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]= new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();
       
        int maxl=-1;
        int fv=-1;
        int lidx=-1;
        int currl=0;

        int bfst=-1;



        for(int i=0;i<n;i++){

            if(arr[i]<=t){
                if(currl==0){
                    fv=arr[i];
                }
                currl++;
            }else{

                if(currl>maxl){
                    maxl=currl;
                    bfst=fv;
                    lidx=i-1;
                }
                currl=0;
               
            }
            if(currl>maxl){
                maxl=currl;
                bfst=fv;
                lidx=i-1;
            }
            
              
                
               


            

            
        }

        System.out.print(bfst+" "+maxl+" "+lidx);







    }
    
}
