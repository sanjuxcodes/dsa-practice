public class maxsum {
    public static void main(String[] ar){

        int arr[]={-2,-3,-1,2,-4};
        int sum=0;
        int max=Integer.MIN_VALUE;


        for(int i : arr){
            sum+=i;

            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;

            }
          


        }
        System.out.print(max);
    }
    
}
