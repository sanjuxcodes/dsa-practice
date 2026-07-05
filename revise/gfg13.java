import java.util.Scanner;

class gfg13{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        String ip=sc.nextLine();

        String[] parts= ip.split("\\s+");

        int arr[]= new int[parts.length];
        int trr[]= new int[parts.length];

        int j=0;

        // 1 2 -1 4 -2
        for(int i =0;i<parts.length;i++){

            arr[i]=Integer.parseInt(parts[i]);

            if(arr[i]<0){
                trr[j]=arr[i];
                j++;
            }


        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]>=0){
                trr[j]=arr[k];
                j++;

            }

        }
        boolean t=false;

        for(int i: trr){
            if(t){
            System.out.print(" "+i);
            continue;
        }
       
        System.out.print(i);

        t=true;


        }

        

    }
}