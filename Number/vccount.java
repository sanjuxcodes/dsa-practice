import java.util.Scanner;
public class vccount {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine().toLowerCase().replaceAll("^a-zA-Z ","");



        String vow="aeiou";



        int v=0;
        int c=0;
        for(char c: ip.toCharArray()){
            if(vow.indexOf(c) !=-1){
                v++;

            }


        }




        



    }
    
}
