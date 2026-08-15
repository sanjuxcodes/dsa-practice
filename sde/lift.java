
import java.util.*;
class lift{
    public static int maxPeople(int N, int c, int[] arr) {

        Arrays.sort(arr);
        int a=0;



        for(int i =0;i<N;i++){
            if(c>=arr[i]){
                c-=arr[i];
                a++;

            }

        }

       

        
        return a;
    }
    public static void main(String[] args){


    }
}