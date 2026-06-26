import java.util.Scanner;
public class doc {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int p=sc.nextInt();

        int arv= sc.nextInt();

        

        int doc=0;
        int pa=0;



        int wt=0;


        for(int i=0;i<p;i++){
            
            wt=doc-pa;
         
            pa+=arv;
            doc+=10;

           
           

        }
        if(wt<0){
            wt=0;
        }

       System.out.print(wt);
        

    }
    
}
