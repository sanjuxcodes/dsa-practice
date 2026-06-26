import java.util.*;
public class mrg {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int arr[]= new int[a];

        for(int l=0;l<a;l++){
            arr[l]=sc.nextInt();

        }
        

        int b = sc.nextInt();

        int brr[]= new int[b];

        for(int m=0;m<b;m++){
            brr[m]=sc.nextInt();
        }



        int i=0;
        int j=0;
        ArrayList<Integer> map= new ArrayList<>();


        while(i<a && j<b){

            if(arr[i]<=brr[j]){

                map.add(arr[i]);
                i++;


            }
            else{
                map.add(brr[j]);
                j++;
            }
        }
            
            

            while(j<b){
                map.add(brr[j]);
                j++;
            }
            while(i<a){
                map.add(arr[i]);
                i++;
            }

        
        System.out.print(map);

    }
    
}
