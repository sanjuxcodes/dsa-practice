import java.util.Scanner;
public class permu {


    static boolean comp(int arr[],int err[]){

        for(int i=0;i<26;i++){
            if(arr[i] !=err[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] ar){

        Scanner sc = new Scanner(System.in);

        String s1=sc.nextLine();
        String s2= sc.nextLine();


        int srr[]= new int[26];

        


        for(char ch:s1.toCharArray()){
            srr[ch-'a']++;

        }
        int winsiz=s1.length();

        for(int i=0;i<s2.length();i++){
            int ssrr[]= new int[26];
            int winlen=0;
            int l=i;
            while(winlen<winsiz && l<s2.length()){
                ssrr[s2.charAt(l) -'a']++;
                winlen++;
                l++;
            }
            if(comp(srr,ssrr)){
                System.out.print("yes");
                return;

            }
        }
        System.out.print("no");

    }
    
}
