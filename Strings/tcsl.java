import java.util.Scanner;
public class tcsl {
  public static void main(String[] args){

    Scanner sc= new Scanner(System.in);

    String ip = sc.nextLine().trim();

    String op= sc.nextLine().trim();

    if(op.length()!=ip.length()){
        System.out.println("not");
        return;
    }
    int freq[]= new int[128];

    for(char ch: ip.toCharArray()){
        freq[ch]++;

    }
    for(char ch: op.toCharArray()){
        freq[ch]--;

    }
    for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
            System.out.println("no");
            return;
        }
    }
    System.out.println("yes");


        
    }
    
}
