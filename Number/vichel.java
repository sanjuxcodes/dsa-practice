import java.util.*;

class vichel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        



        while(t>0){
            int v=sc.nextInt();

          int w= sc.nextInt();

          if(w%2==1){
            System.out.println(-1);
          }
          else if(w<2*v){
            System.out.println(-1);

          }
          else if(w>4*v){
            System.out.println(-1);
          }
          else{
            int x=0;
            int y=0;

            y=(w-2*v)/2;
            x=v-y;
            System.out.println(x+" "+y);



           
          }

            t--;
        }
    }
}