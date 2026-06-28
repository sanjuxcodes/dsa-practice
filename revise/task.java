import java.util.Arrays;
import java.util.Scanner;

class tusk{

    String n;
    int p;
    int d;

    tusk(String n,int p,int d){
    this.n = n;
    this.p = p;
    this.d = d;
    }


}



public class task {


    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int s=sc.nextInt();
        sc.nextLine();

        tusk[] tasks= new tusk[s];

        for(int i =0;i<s;i++){
            String nm=sc.next();
            int pp=sc.nextInt();
            int dd=sc.nextInt();

            sc.nextLine();

            tasks[i]=new tusk(nm,pp,dd);

        }
        Arrays.sort(tasks,(a,b) ->{

            if(a.p != b.p){
                return b.p-a.p;
            }
            else if(a.d != b.d){
                return a.d-b.d;

            }
            else
               return a.n.compareTo(b.n);

        });

        for(tusk x:tasks){
            System.out.println(x.n+" "+x.p+" "+x.d);
        }

    }
    
}
