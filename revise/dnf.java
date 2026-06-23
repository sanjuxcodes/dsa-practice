public class dnf {
    public static void main(String[] ar){
        int arr[]={2,1,0,1,2,0};

        int z=0;
        int o=0;
        int t=0;

        for(int i: arr){
            if(i==0){
                z++;
            }
            if(i==1){
                o++;


            }
            if(i==2){
                t++;

            }


        }
        int q=0;
        while(z>0){
            arr[q]=0;
            q++;
            z--;
        }while(o>0){
            arr[q]=1;
            q++;
            o--;

        }while(t>0){
            arr[q]=2;
            q++;
            t--;
        }

        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    
}
