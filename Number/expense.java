import java.util.LinkedHashMap;
import java.util.Scanner;
public class expense {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inc= sc.nextInt();
        sc.nextLine();

        LinkedHashMap<String,Integer> map= new LinkedHashMap<>();

        

        int sav=0;
        int exp=0;
        String ter="done";

        while(true){

            String gn= sc.nextLine();
            if(gn.equals("done")){break;}
            
          int rs= sc.nextInt();
          sc.nextLine();

        
            

            

            map.put(gn,map.getOrDefault(gn,0)+rs);
            exp+=rs;
            



        }
        sav=inc-exp;
        
        System.out.println("Total income: "+ inc);
        System.out.println("Total savings: "+sav);
        for(String key : map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
    
}
