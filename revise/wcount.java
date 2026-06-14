import java.util.Scanner;
class wcount{

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine();
        int c=1;


        for(char ch : ip.toCharArray()){

            if(Character.isUpperCase(ch)){
                c++;

            }



        }
        System.out.print(c);


    }

 }