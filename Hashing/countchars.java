import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class countchars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();


        while(t>0){

           String str1=sc.nextLine();

      

           String str2=sc.nextLine();
           




           HashMap<Character,Integer> map= new HashMap<>();
           HashSet<Character> nap= new HashSet<>();


           for(char ch : str1.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);

           }
           int r=0;
            for(char ch : str2.toCharArray()){
                nap.add(ch);

     
            //System.out.println("gjggjgjg");

           }

           for(char ch: nap){
            r+=map.getOrDefault((ch), 0);
           }

           System.out.println(r);





            t--;
        }
    }
    
}
