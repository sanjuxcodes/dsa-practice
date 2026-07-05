import java.util.Scanner;
public class gfg15 {

    public static void main(String[] ar){
        Scanner sc = new Scanner(System.in);

        String ip = sc.nextLine().replaceAll("[^a-z]","");
        
                // code here
                
                int frq[]= new int[26];
                
                for(char ch : ip.toCharArray()){
                    
                    frq[ch-'a']++;
                    
                    
                }
                int max=0;
                int id=-1;
                
                for(int i=0;i<frq.length;i++){
                    if(frq[i]>max){
                        max=frq[i];
                        id=i;
                        
                    }
                }
                System.out.print((char)(id+'a'));
            }
        }



