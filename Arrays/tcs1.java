import java.util.*;

class tcsss{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int tc=sc.nextInt();

        while(tc>0){
        
            int n = sc.nextInt();

            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int e=0,o=0;

            for(int i=0;i<n;i++){
                if(arr[i]%2 ==0){
                    e++;

                }
                else{
                    o++;
                }


            }
            long rese=(e*(e-1))/2;
            long reso=(o*(o-1))/2;

            System.out.println(rese+reso);
            

            tc--;
        }

        
    }
}