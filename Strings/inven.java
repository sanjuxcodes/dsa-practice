import java.util.HashMap;
import java.util.Scanner;

class inven{
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();
        for(char ch: ip.toCharArray()){

            if(Character.isDigit(ch)){
                System.out.print("invalid");
                return;
            }

        }

        String now[]= ip.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(int i =0;i<now.length;i++){
           

        map.put(now[i],map.getOrDefault(now[i],0)+1);



        
        }

        for(int i =0;i<now.length;i++){
            System.out.println(now[i]+" "+map.get(now[i]));
        }
        System.out.print(map);
    }
}