public class bbl {

    static void swp(int arr[],int a ,int b){
        
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }

    public static void main(String[] ar){

        int arr[]={2,3,4,5,1};


        for(int i=0;i<arr.length;i++){

        boolean swpd=false;
            for(int j=0;j<arr.length-i-1;j++){
                

                if(arr[j]>arr[j+1]){

                    swp(arr,j,j+1);
                    swpd=true;



                }
            }
                if(!swpd){
                  break;
                
            }

        }
        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    
}
