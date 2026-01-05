

public class koko {
        static long tmm(int []arr, int h){
            long req=0;
            for(int x=0; x<=arr.length-1;x++){
                req += (arr[x] + h - 1) / h;
    
    
            }
            return req;
        }
        static int getmax(int []arr){
            int mx=arr[0];
            for(int i=0;i<=arr.length-1;i++){
                if(mx<=arr[i]){
                    mx=arr[i];
                }
            }
            return mx;
        }
        public static  int minEatingSpeed(int[] piles, int h) {
            
            int low =1;
            int high=getmax(piles);
    
            int ans=high;
    
            while(low<=high){
                int mid =(low+high)/2;
                
    
                if(tmm(piles,mid)<=h){
                    ans=mid;
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            return ans;
        }

        public static void main(String[] args) {
            int arr[]={3,6,7,11};
            System.out.print(minEatingSpeed(arr, 8));
        }
    }

    

