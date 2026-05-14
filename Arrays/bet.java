import java.util.Scanner;


public class bet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k=sc.nextInt();


        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int pf=0;
        int ml=0;

        int l=0;

        for(int i=0;i<n;i++){

            pf+=arr[i];

           
           

           
            

            if(pf>=k){
                pf-=arr[l];
                l++;
            }
            ml=Math.max(ml, i-l+1);

        }

        System.out.println(ml);



        
    }
    
}
