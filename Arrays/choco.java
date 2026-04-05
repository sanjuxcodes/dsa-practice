import java.util.Scanner;
class choco{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int res[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0 ;i<n; i++){
            if(arr[i]!=0){
                res[k]=arr[i];
                k++;

            }
        }
        while(k<n){
            res[k]=0;
            k++;
        }
        for(int i :res){
            System.out.print(i + " ") ;
        }
        
    }
}