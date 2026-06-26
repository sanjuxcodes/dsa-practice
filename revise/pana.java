import java.util.Scanner;
public class pana {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine().toLowerCase();
        String jp=ip.replaceAll("[^a-zA-Z]","");
    

        int arr[]= new int[26];

        for(char ch : jp.toCharArray()){
            arr[ch-'a']++;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.print("Not panagram");
                return;

            }
        }
        System.out.print("Panagram");

    }
    
}
