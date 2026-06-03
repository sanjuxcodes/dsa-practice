import java.util.HashMap;
public class maxfreq {

    public static void main(String fff[]){

        String ip="hllowher";

        HashMap<Character,Integer> map= new HashMap<>();

        int max=0;

        for(char ch: ip.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);

           
        }
        char rs='x';
        for(char ch: ip.toCharArray()){

            if(max<map.get(ch)){
                max=map.get(ch);
                rs=ch;

            }

           
        }
        System.out.print(rs);



    }
    
}
