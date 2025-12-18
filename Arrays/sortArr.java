public class sortArr {

    static void srt(int arr[]){
        int a=0,b=0,c=0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==0){
                a++;


            }
            else if(arr[i]==1){
                b++;
            }
            else
                c++;}

            for(int i=0;i<a;i++){
                arr[i]=0;


            }
            for(int i=a;i<b+a;i++){
                arr[i]=1;


            }
            for(int i=a+b;i<arr.length;i++){
                arr[i]=2;


            }

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);


            }

        }
        public static void main(String[] args) {
            int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
            srt(arr);
        }
    }
    

