public class SecondLargest {
    public static  int secondLargestEle(int[] arr) {

        int lar= arr[0];
        int sec = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> lar){
                sec= lar;
                lar =arr[i];
            }
            else if(arr[i]<lar && arr[i]> sec){
                sec= arr[i];
            }
        }
    return sec;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9};
        System.out.println(" 2nd Largest element: " + secondLargestEle(arr));
    }
    
}
