import java.util.*;
public class frst {

    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();

        for(char ch: ip.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);


        }
        
        for(int i =0;i<ip.length();i++){
            
            if(map.get(ip.charAt(i))== 1){
                System.out.print(i);
                return;

            }
        }


    }
    
}
