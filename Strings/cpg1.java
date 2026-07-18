import java.util.HashMap;
import java.util.Scanner;


class cpg1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        long sum=0;
        HashMap<Character,Integer> map= new HashMap<>();

        int idx=97;
        for(int i=26;i>0;i--){

            map.put((char)idx,i);
            idx++;

        }

        char [] arr= new char[s.length()];
        for(int i =0;i<s.length();i++){
             arr[i]=s.charAt(i);
             sum+=(i+1)*map.get(arr[i]);

            // sum+=(i+1)*((int)arr[i] -71-(2*i));


        }

        // Logic

        System.out.print(sum);
        
        


        // Output
      
    }
}