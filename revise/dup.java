import java.util.LinkedHashSet;
public class dup {


    public static void main(String[] ar){

        String ip ="TCSdiggtal";

        LinkedHashSet<Character> map = new LinkedHashSet<>();

        for(char ch: ip.toCharArray()){
            map.add(ch);

        }


        for(char ch: map){
            System.out.print(ch);
        }
    }
    
}
