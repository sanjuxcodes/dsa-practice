public class qck {

    

    static int parti(int arr[],int l,int h){

        int pvt=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(pvt>=arr[i] && i<h){
                i++;
            }
            while(arr[j]>pvt && j>l){
                j--;
            }
            if(i<j){
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        int t=arr[l];
        arr[l]=arr[j];
        arr[j]=t;


        return j;









    }


    static void sort(int arr[],int l,int h){


        if(l<h){
            int part= parti(arr,l,h);
            sort(arr,l,part-1);
            sort(arr,part+1,h);
        }



    }
    public static void main(String[] ar){

        int arr[]={4,3,1,2};
        int l=0;
        int h=arr.length-1;

        sort(arr,l,h);

        for(int i : arr){
            System.out.println(i);
        }


    }
    
}
