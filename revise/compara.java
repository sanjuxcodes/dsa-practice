import java.util.Arrays;
public class compara {

    public static void main(String[] argd){
        String arr[]={"banana","kiwi","apple","cat","dog","bat"};

        Arrays.sort(arr,(a,b) ->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            else
                return b.length()-a.length();
        });


        for(String x:arr){
            System.out.println(x);
        }


    }
    
}
