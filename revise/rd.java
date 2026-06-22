import java.util.HashSet;
public class rd {

    public static void main(String[] ar){
        int arr[]={1,2,4,6,6,7,7};
        int l=0;
        int n = arr.length;
        HashSet<Integer> map = new HashSet<>();


        for(int i=0;i<n;i++){
            map.add(arr[i]);
        }
        
        for(int i: map){
            if(l==0){
                System.out.print(i);
                l++;
                continue;
            }

            System.out.print(" "+i);
 
        }

    }
    
}
