import java.util.*;
public class fc {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();

        for(char ch : ip.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);


        }
        int i=0;
        for(char k :map.keySet()){

            
            if(i>0){
                System.out.print(" "+k+map.get(k));

            }else{
                System.out.print(k+map.get(k));
            }
            i++;
        }

    }
    
}
