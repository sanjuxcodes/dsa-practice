public class maxsubsetprod {

    public static void main(String[] args) {
        
        int arr[]={-2,0,0};
        long maxprod=1;
        long prod=1;

        int nc=0;
        int maxneg=Integer.MIN_VALUE;
        int zc=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zc++;
                continue;
            }
            if(arr[i]<0){
                nc++;
                maxneg=Math.max(arr[i], maxneg);
            }
            prod=prod*arr[i];


        }
        if (nc == 1 && nc + zc == arr.length){
            System.out.println(0);
        }
        if(nc%2==1){
            prod=prod/(maxneg);
        }
        

      
       
        
        System.out.println(prod);


    }
    
}
