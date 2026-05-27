import java.util.HashMap;
import java.util.Scanner;
public class tcsr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op="";

        String ip= sc.nextLine();
       HashMap<Character,Integer> map= new HashMap<>();

       for(int i=0;i<ip.length();i++){
        map.put(ip.charAt(i),map.getOrDefault(ip.charAt(i),0)+1);


       }
       for(int i=0;i<ip.length();i++){
        if(map.get(ip.charAt(i))==1){
            System.out.print(ip.charAt(i));
            return;

        }
        else{
            System.out.println("nope bro");
        }
       }


    }
    }
    

