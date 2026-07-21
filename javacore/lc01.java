class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int l=0;
        int r=0;

        int arr[]=new int[nums1.length+nums2.length];
        int i=0;
        while(l< nums1.length && r< nums2.length){

            if(nums1[l]<nums2[r]){
            arr[i]=nums1[l];
            l++;
            

            }
            else{
                arr[i]=nums2[r];
                r++;
            }

            i++;



        }
        
        while(l<nums1.length){

                arr[i]=nums1[l];
                l++;
                i++;

            }
        
        while(r<nums2.length){
            arr[i]=nums2[r];
                r++;
                i++;


        }

        if(arr.length %2==1){
            int m = (arr.length-1)/2;
            return (double)arr[m];
        }
        
            int m =arr.length/2;

            int res=arr[m-1]+arr[m];

            return (double)res/2;

    




        
    }
}