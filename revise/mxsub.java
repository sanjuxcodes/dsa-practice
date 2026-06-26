import java.util.HashSet;
import java.util.Scanner;
public class mxsub {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int s= sc.nextInt();
        int ss=sc.nextInt();
        int g= sc.nextInt();
        int sg=0;
        int ssg=0;

        while(g>=1){
        HashSet<Integer> sf= new HashSet<>();

        for(int i=1;i<=s;i++){

           
            if(s%i==0){
                sf.add(i);

            }
        }

        HashSet<Integer> ssf= new HashSet<>();
        for(int i=1;i<=ss;i++){

           
            if(ss%i==0){
                ssf.add(i);

            }
        }
       

        if(sf.contains(g)){
            sg++;
            s--;

        }else{
            g--;

        }

        if(ssf.contains(g)){
            ssg++;
            ss--;

        }else{
            g--;

        }







    }

    System.out.print(sg+" "+ssg);
    }
        
    
}
