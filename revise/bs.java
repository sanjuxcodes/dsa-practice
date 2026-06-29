import java.util.Scanner;
public class bs {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        sc.nextLine();

        String ip= sc.nextLine().replaceAll("\\[|\\]","");

        String[] parts=ip.split(",");
        int arr[]= new int[parts.length];


        for(int i =0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);

        }

        int l=0;
        int h=arr.length-1;

        while(l<=h){
            int mid =(l+h)/2;

            if(arr[mid]==k){
                System.out.print(mid);
            }
            if(arr[mid]<k){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }

    }
    
}
