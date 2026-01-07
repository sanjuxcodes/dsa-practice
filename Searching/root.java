public class root {
    static int thrdroot(int m ,int n){
        int low=1;
        int high=m;

        while(low<=high){
            int mid=(low+high)/2;
            int res=power(mid, n,m);

            if(res==m){
                return mid;
            }
            else if(res<m){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return -1;
    }
    static int power(int mid,int n,int m){
        int res=1;
        for(int i=0;i<n;i++){
            res=res*mid;
            if (res> m) return res;
            
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.print(thrdroot(27, 3));
    }
}
