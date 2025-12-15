public class isSorted {
    public static boolean srtd(int arr[]){

        for (int idx = 0; idx < arr.length-1; idx++) {
           if(arr[idx]>arr[idx+1]){
            return false;
           }
            
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,5};

        System.out.println(srtd(arr));
    }
    
}
