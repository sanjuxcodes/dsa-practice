import java.util.*;
class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String ip= sc.nextLine();

        ArrayList<Integer> list= new ArrayList<>();
        int s=0;

        int j=0;
        int i=0;
        while(i<ip.length()){

            char ch= ip.charAt(i);
            if(Character.isDigit(ch)){
                j=i;
                while(j<ip.length() && Character.isDigit(ip.charAt(j))){
                    j++;
                }
                s+=Integer.parseInt(ip.substring(i,j));
                i=j-1;
            }
        i++;
    }
        
      

            System.out.print(s);

    }
    
}
