
import java.util.HashSet;

public class duplicity {
    static boolean findd(int arr[]){

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[]={2,1,4,2};
        System.out.print(findd(arr));
        
    }
}
