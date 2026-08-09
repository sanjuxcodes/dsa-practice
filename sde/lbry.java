import java.util.Scanner;

class lbry{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int c= sc.nextInt();


        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int s=0;


        for(int i =0;i<n;i++){
            if(arr[i]>c){

                int a=arr[i]/c;

                s+=a;
                if(i+1<n){
                    int r =arr[i]%c;
                    arr[i+1]+=r;

                }

                continue;


            }
            else if( i+1<n && arr[i]<c){
                arr[i+1]+=arr[i];
                continue;

            }
            else{
                
                int a=arr[i]/c;

                s+=a;
            }


        }
        System.out.print(s);






        
    }
}