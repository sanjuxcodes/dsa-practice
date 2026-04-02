
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



class list{
    public static void main(String[] args) {
        List<int[]> lis= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       


        
       for(int i=0;i<n;i++){
        int a = sc.nextInt();

        int b= sc.nextInt();
        lis.add(new int[]{a,b});
       }

  

    Collections.sort(lis, (a, b) -> {
        if (a[0] < b[0]) return -1;
        if (a[0] > b[0]) return 1;
        else {
            if (a[1] < b[1]) return -1;
            if (a[1] > b[1]) return 1;
            return 0; // IMPORTANT
        }
    });

       System.out.println("LIST : ");
       for(int i=0;i<lis.size();i++){
       int pair[]= lis.get(i);
     
       System.out.println( pair[0] + " "+pair[1]);
       }



    }
}