public class kdne {
    public static void main(String[] ar){
        int arr[]={-1, -2 ,-3, -4 ,-5};
        int s=0;
        int max=Integer.MIN_VALUE;

        int min=Integer.MIN_VALUE;



        for(int i=0;i<arr.length;i++){

            s+=arr[i];

            if(s<0){
               
                s=0;
            }
            max=Math.max(max,s);
        }
        
        System.out.print(max);
    } 
}
