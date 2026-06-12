import java.util.Scanner;
public class time {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();

        String[] time= ip.split(":");
        int x=0;
        int y=0;
        int z=0;

        if(time[2].contains("PM")){
             x =Integer.parseInt(time[0])+12;

             y = Integer.parseInt(time[1]);
            z= Integer.parseInt(time[2].replace("AM","").replace("PM",""));
            if(x>=24){
                x-=12;
            }

        }
       else if(Integer.parseInt(time[0]) >=12 && time[2].contains("AM")){
            x=Integer.parseInt(time[0])-12;
            y = Integer.parseInt(time[1]);
            z= Integer.parseInt(time[2].replace("AM",""));

        }
        else{
            

                x = Integer.parseInt(time[0]);
            
                y = Integer.parseInt(time[1]);
            
                z = Integer.parseInt(time[2].replace("AM",""));
            
        }

      System.out.printf("%02d:%02d:%02d",x,y,z);
    }
    
}
