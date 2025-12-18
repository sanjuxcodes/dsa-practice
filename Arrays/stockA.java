public class stockA {
        static int max(int a, int b){
            if(a<b){
    
            return b;}
            else 
                return a;
        }
        static int min(int a, int b){
            if(a>b){
    
            return b;}
            else 
                return a;
        }
        public static int maxProfit(int[] prices) {
    
            int mini=prices[0];
            int profit=0;
            int cost;
    
            for(int i=1; i<prices.length; i++){
    
            cost=prices[i]-mini;
            profit=max(profit,cost);
    
            mini=min(mini,prices[i]);
    
    
            }
    
            return profit;
    
    
            
        }

        public static void main(String[] args) {
           int arr[]={2,3,1,5,6,7,2,2,1,10};

           System.out.println("max proft will be : "+maxProfit(arr));
        }
    }
    

