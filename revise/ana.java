import java.util.Scanner;
public class ana {
    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        String ip= sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z] ","");

        String ipp= sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z]","");


        if(ip.length() != ipp.length()){
            System.out.print("no");
            return ;
        }

        int arr[]= new int[26];

        for(char c : ip.toCharArray()){

            arr[c-'a']++;
        }

        for(char c : ipp.toCharArray()){

            arr[c-'a']--;
        }

        for(int i : arr){
            if(i!=0){
                System.out.print("no");
                return;
            }
        }
        System.out.print("yes");
    }
}
