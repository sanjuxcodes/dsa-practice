public class TwoSumF {

static String TwoSum(int []arr,int t){

    int l=0;
    int n= arr.length;
    int r=n-1;
    int sum=0;


    while(l<r ){
        sum= arr[l]+arr[r];

        if(sum==t){
            return "YES";

        }
        else if(sum<t){
            l++;
        }
        else
            r--;


    }



    return "NO";

}
public static void main(String[] args) {
    int arr[]={2,5,6,8,11};
    System.out.println("can we achive 14 from this array?:  "+ TwoSum(arr, 14));
}
    
}
