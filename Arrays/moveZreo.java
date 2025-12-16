public class moveZreo {
    public static void moveit(int arr[]){
        int j=0;
        int n=arr.length;
        
        
    

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                
                arr[j++]=arr[i];
                
                

            }

        }

       
        for(int i =j;i<n;i++){
            arr[i]=0;
        }

        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[]={1,0,2,1,0,3,2,0,8};
        moveit(arr);
    }
}
