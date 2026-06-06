import java.util.LinkedHashMap;
import java.util.Scanner;

public class freqrsrv {

    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
        

        String ip = sc.nextLine().toLowerCase();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(char c:ip.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        int x=0;
        for(char c: map.keySet()){
            System.out.println(c+": "+map.get(c));
            
            if(x<map.size()-1){
                System.out.print(" ");

            }
            x++;

            
            
        }
    }
    
}
