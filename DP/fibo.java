
import java.util.*;;


public class fibo {
    static int f(int n ){

        if(n<=1){
            return n;
        }
        int dp[]= new int[n+1];
        Arrays.fill(dp, -1);

        if(dp[n]!=-1){
            return dp[n];
        }
    
        return dp[n]=f(n-1)+f(n-2);
    }

    public static void main(String[] args) {
        System.out.print(f(6));
    }
    
    
}
