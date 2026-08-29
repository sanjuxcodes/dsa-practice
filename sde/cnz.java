
import java.util.Scanner;
class cnz{
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    int arr[][]= new int[m][n];

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    int max = Integer.MIN_VALUE;
    for(int i=0;i<m;i++){
        int s=0;
        for(int j=0;j<n;j++){
            s+=arr[i][j];
        }
        max=Math.max(s,max);
    }

    System.out.print(max);




 }
}