import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class tcsp {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        String dig[]= ip.split(",");
        




        ArrayList<Integer> arr= new ArrayList<>();

        for(int i =0;i<dig.length;i++){
            arr.add(Integer.parseInt(dig[i]));
        }
        int n =arr.size();

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        LinkedHashSet<Integer> m = new LinkedHashSet<>();

        

        for(int i=0;i<n;i++){
           
            map.put(arr.get(i),map.getOrDefault(arr.get(i),0)+1);
            m.add(arr.get(i));


        }

        int k = sc.nextInt();

        int j=0;

        while(k>0){

            
            
            int r=map.keySet().iterator().next();
            int max =map.get(arr.get(r));
            
            for(int i : map.keySet()){
                if(map.get(i) > max){
                    max=map.get(i);
                    r=i;
                }

                

            }
            map.remove(r);
            System.out.print(r);
            k--;

        }



    }
    
}
