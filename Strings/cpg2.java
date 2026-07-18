import java.util.Scanner;

public class cpg2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Input
        String s = sc.next();
        StringBuilder sb = new StringBuilder();


        // Write your logic here
        int arr[]= new int[26];
       for( char ch: s.toCharArray()){
        arr[ch-'a']++;

        

       }
       for(int i =0;i<arr.length;i++){

        while(arr[i]>0){


        sb.append((char)(i+'a'));
        arr[i]--;
        }

       }


        // Print Output
        System.out.println(sb);
    }
}