public class singleNum {
    public static int isSingle(int arr[]){
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor^=arr[i];
            
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        System.out.println(isSingle(arr));
    }
    
}
