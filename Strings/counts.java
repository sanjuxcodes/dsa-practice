import java.util.Scanner;
public class counts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine().toLowerCase();

        int v=0;
        int c=0;
        int s=0;
        int sp=0;
        int d=0;

        String vow="aeoiu";


        for(char ch: ip.toCharArray()){

            if(Character.isLetter(ch)){

                if(vow.indexOf(ch)!= -1){
                    v++;

                }
                else{
                    c++;
                }

            }
            if(Character.isDigit(ch)){
                d++;

            }
            if(Character.isWhitespace(ch)){
                s++;
            }
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                sp++;
            }




            

        }
        System.out.println("vowels:"+v);
        System.out.println("consunant: "+c);
        System.out.println("Space: "+s);
        System.out.println("spcl chars: "+(sp+d));


    }
    
}
