import  java.util.*;
public class tcsp {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String ip= sc.nextLine().toLowerCase();

        int freq[]=new int[26];

        for(int i=0;i<ip.length();i++){
            char ch=ip.charAt(i);
            freq[ch-'a']++;

        }
        int f=0;

       for(int i=0;i<ip.length();i++){
        char ch=ip.charAt(i);
        if(freq[ch-'a']==1){
            System.out.print(ch);
            f++;
            break;
        }}
        if(f==0)
            System.out.println("-");
       }
       
        
    
}
