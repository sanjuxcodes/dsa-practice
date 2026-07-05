import java.util.ArrayList;
import java.util.Scanner;
public class gfg14 {

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ls1= new ArrayList<>();
        ArrayList<String> ls2= new ArrayList<>();
        ArrayList<Integer> ls3= new ArrayList<>();


int l=0;
        while(sc.hasNextLine()){

            String ip = sc.nextLine();

            if(ip.equals("END"))break;

            String[] parts= ip.split("\\s+");

            ls1.add(l,Integer.parseInt(parts[0]));
            ls2.add(l,parts[1]);
            ls3.add(l,Integer.parseInt(parts[2]));
            l++;




        }
        int key =sc.nextInt();
        sc.nextLine();


        if(ls1.contains(key)){
            int idx= ls1.indexOf(key);
            System.out.print(ls2.get(idx));
            System.out.println(ls3.get(idx));
        }




    }
    
}
