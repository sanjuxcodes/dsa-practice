import java.util.*;

public class fact {

    static int fact(int n){

        if(n<2){
            return 1;
        }
        int r=1;
        for(int i=2;i<=n;i++){
            r=multi(r, i);


        }




        return r;

    }



   


    
    static int multi(int x,int y){
        int res=0;
        for(int i =0;i<y;i++){
            res+=x;


        }
        return res;
    }

    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){

        int n = sc.nextInt();

        System.out.println(fact(n));
        t--;
        }
       

        


        
        
        
    }
    
}
