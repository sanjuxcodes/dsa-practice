public class majorityEle {
    public static int majorityElement(int[] nums) {
        int ele=0;
        int cnt=0;
        int n=nums.length;

        for(int i =0;i<n;i++){
            if(cnt==0){
                cnt=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                cnt++;
            }
            else
                cnt--;
        }

        int ct=0;

        for(int i =0; i<n;i++){
            if(nums[i]==ele)
                ct++;
        }
        if(ct>n/2)
            return ele;
        else
           return -1;
    }

    public static void main(String[] args) {
        int arr[]={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println("majority ele there is : "+majorityElement(arr));
    }
    
}
