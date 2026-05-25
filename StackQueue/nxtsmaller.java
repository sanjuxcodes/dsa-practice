import java.util.Stack;
public class nxtsmaller {

    public static void main(String[] args) {

        
        
        int arr[]={1,2,3,10,8};
        int ans[]= new int[arr.length];


        Stack<Integer> st= new Stack<>();

        int n=arr.length-1;

        while(n>=0){
            int curr=arr[n];

           

            while(!st.empty() && st.peek()>=curr){
                int x=st.pop();

            }
            if(st.isEmpty()){
                ans[n]=-1;

                
            }else{
                ans[n]=st.peek();
            }

            st.push(curr);





            n--;
        }

        for(int i:ans){
            System.out.println(i);
        }



    }
    
}
