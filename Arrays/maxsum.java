import java.util.Scanner;
public class maxsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]= new int[n];

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int l=0;
        int sum=0;
        int max= Integer.MIN_VALUE;
        //2 -3 -9 -1 4 5 -1

        for(int i=0;i<n;i++){

            sum+=arr[i];
            max=Math.max(sum, max);

            if(sum<0){
                sum=0;
                



            }
        



        }
        System.out.println(max);
    }
    
}
