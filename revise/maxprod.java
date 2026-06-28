public class maxprod {
    public static void main(String [] args){

        int arr[]={-1,0};

        int z=0;
        int ng=0;
        int prod=1;
        int maxng=Integer.MIN_VALUE;


        for(int i: arr){


            if(i<0){
                ng++;
                maxng=Math.max(i,maxng);

            }
            if(i==0){z++;
                continue;
            }

            prod*=i;



        }
        if(ng%2==1){
            prod/=maxng;

        }
        if(ng%2==1 && z+ng==arr.length){
            System.out.print(0);
            return;

        }if(z==arr.length){
            System.out.print(0);
            return;

        }else {
            System.out.println(prod);
            return;
        }


    }
    
}
