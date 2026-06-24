import java.util.Scanner;
public class wrd {
    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        String ip= sc.nextLine();

        String[] words=ip.split(" ");

      

        for(int i=0;i<words.length;i++){

            String st=words[i];

            if(i>0){
                System.out.print(" ");
            }

            for(int j=st.length()-1;j>=0;j--){
                System.out.print(st.charAt(j));
            }
      
          
            

        }
       
        




    }
    
}
