public class removeDuplicate {
    public static int removeDuplicates(int[] arr) {
        int i =0;
        for(int j =0; j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        return i+1;
        
    }
    public static void main(String[] args) {
        
        int arr[]={1,22,22,33,33,33};
        System.out.println("no of unique ele are: "+removeDuplicates(arr));
    }
}