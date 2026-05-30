import java.util.*;
public class road {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int n1=s.nextInt();
        int n2= s.nextInt();


        


        HashSet<Integer> set = new HashSet<>();

        

        for(int i =0;i<n1;i++){
            set.add(s.nextInt());
        }
        for(int i =0;i<n2;i++){
            set.add(s.nextInt());
        }

        ArrayList<Integer> list= new ArrayList<>(set);





        Collections.sort(list);
        int n= list.size();

        if(list.size()%2==1){
            System.out.print(list.get(n/2));
        }else{

            System.out.printf("%.2f",(list.get(n/2) + list.get((n/2)-1)) / 2.0);

        }


        


        


   
    }
    
}
