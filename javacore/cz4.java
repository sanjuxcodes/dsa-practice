import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class cz4 {

    public static int uniqueAirportCodes( String s) {

        // Write your logic here
   
        HashSet<String> map = new HashSet<>();

        int l =0;
        
        char []arr= new char[3];
        for(char ch : s.toCharArray()){
            

            arr[l]=ch;
            l++;

            if(l==3){
            Arrays.sort(arr);
            String si= new String(arr);

            map.add(si);
            l=0;
        }

        }


        int result = map.size();

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String input2 = sc.next();

        System.out.println(uniqueAirportCodes( input2));

        sc.close();
    }
}