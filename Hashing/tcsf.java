import java.util.HashMap;
import java.util.Scanner;
public class tcsf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine().trim();

        HashMap<Character,Integer> map= new HashMap<>();

        for(char ch : ip.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);


        }

        for(int i =0;i<ip.length();i++){
            System.out.println(ip.charAt(i)+"="+map.get(ip.charAt(i)));
        }
    }
    
}
