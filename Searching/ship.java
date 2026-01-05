

public class ship {
    

        static int findd(int arr[],int cap){
            int day=1;
            int load=0;
            for(int i=0; i<arr.length; i++){
    
                //it will get a new mid as cap and cal the psbl days need to cross with that cap..
                if(arr[i]+load>cap){
                    day++;
                    load=arr[i];
                }
                else
                    load+=arr[i];
            }
            return day;
        }
    
        static int getmax(int []arr){
            int max=arr[0];
            for(int i =0; i<arr.length;i++){
                if(arr[i]>max){
                    max= arr[i];
                }
    
    
            }
            return max;
        }
    
        static int getsum(int arr[]){
            int sum=0;
    
            for(int i =0;i<=arr.length-1;i++){
                sum+=arr[i];
            }
            return sum;
        }
        public static int shipWithinDays(int[] weights, int days) {
    
            int low =getmax(weights);
            int high=getsum(weights);
    
            while(low<=high){
                int mid=(low+high)/2;
                int reqday=findd(weights,mid);
    
                if(reqday<=days){
                    
                    high=mid-1;
                }
                else    
                    low=mid+1;
            }
            return low;
    
    
            
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8,9,10};
            System.out.print(shipWithinDays(arr, 5));
        }
    }
    

