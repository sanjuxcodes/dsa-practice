import java.util.Scanner;
public class grade {
    public static void main(String [] ar){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]=new int[n];

        for(int i =0;i<n;i++){

            arr[i]=sc.nextInt();

        }

        int grd[]= new int[7];

        for(int i =0;i<n;i++){
            int marks= arr[i];

           if(marks >= 90 && marks<=100){
            grd[0]++;
            continue;

           }
           else if(marks>=80 && marks< 90){
            grd[1]++;
            continue;
           } else if(marks>=70&& marks< 80){
            grd[2]++;
            continue;
           } else if(marks>=60 && marks< 70){
            grd[3]++;
            continue;
           } else if(marks>=50 && marks< 60){
            grd[4]++;
            continue;
           }
           else if(marks>=40 && marks< 50){
            grd[5]++;
            continue;
           }else{
            grd[6]++;
           }
        }
        int max =0;
        int idx=0;


        for(int i=0;i<grd.length;i++){
            if(grd[i]>max){
                max=grd[i];

                idx=i;

            }

            
        }

        if(idx==0){
            System.out.print("A");

        }if(idx==1){
            System.out.print("B");

        }if(idx==2){
            System.out.print("C");

        }
        if(idx==3){
            System.out.print("D");

        }if(idx==4){
            System.out.print("E");

        }if(idx==5){
            System.out.print("F");

        }
        if(idx==6){
            System.out.print("INVLD");

        }


    }
}
