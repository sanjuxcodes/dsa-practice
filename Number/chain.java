import java.util.Scanner;
public class chain {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        String p=sc.nextLine();

        String o=sc.nextLine();
        final int rs = 5000;

        int tm=0;
        String[] names;
        int pc=0;
        


        if(o.toLowerCase().equals("n")){

            pc=250;
            System.out.println("Comminsion details");
        System.out.println(p+":"+pc);
        return;

            

        }
       
        String ip=sc.nextLine();
            names=ip.split(",");
            for(int i=0;i<names.length;i++){
                tm++;
                
                pc+=500;
                

            }

        

        System.out.println("total: "+(tm+1));
        System.out.println("Comminsion details");
        System.out.println(p+":"+pc);
            
        for(String w: names){
            System.out.println(w+":"+"250");
           

        }

       

       


        

    

    
    
    }
    
}
