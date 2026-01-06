public class bouquets {

        static boolean psbl(int arr[],int day,int m ,int k){
    
            int cnt=0;
            int noofb=0;
            for(int i =0;i<arr.length;i++){
                if(arr[i]<=day){
                    cnt++;
    
                }
                else{
                    noofb+=(cnt/k);
                    cnt=0;}
    
            }
            noofb+=cnt/k;
    
            return noofb>=m;
    
    
        }
        static int getmin(int arr[]){
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                }
    
            }
            return min;
        }
        static int getmax(int arr[]){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
    
            }
            return max;
        }
        public static int minDays(int[] bloomDay, int m, int k) {
    
            int low=getmin(bloomDay);
    
            int high=getmax(bloomDay);
            if(bloomDay.length<(long)m*k){
                return -1;
            }
    
            while(low<=high){
                int mid=(low+high)/2;
    
                if(psbl(bloomDay,mid,m,k)){
                    high=mid-1;
    
                }
                else
                    low=mid+1;
    
            }
            return low;
    
    
            
        }
        public static void main(String[] args) {
            int arr[]={1,10,3,10,2};
            System.out.print(minDays(arr, 3, 1));
        }
    }
    

