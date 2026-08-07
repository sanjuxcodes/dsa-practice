

import java.util.Scanner;

public class cnz {

    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int p = sc.nextInt();
        int rp=p;
        sc.nextLine();
        String s = sc.nextLine();

        if(p==0){
            System.out.print(0);
            return ;

        }
       

        int id=s.indexOf('B');
        int h=0;

        for(int i=id;i>=0;i--){
            if(p==0){
                break;
            }
            if(s.charAt(i)=='C'){
                p++;
            }
            if(s.charAt(i)=='H'){
                p--;
                h++;
            }
        }
        for(int i=id;i<s.length();i++){

            if(rp==0){
                break;
            }
            if(s.charAt(i)=='C'){
                rp++;
            }
            if(s.charAt(i)=='H'){
                rp--;
                h++;

            }


        }
        System.out.print(h);

    }
    
}
