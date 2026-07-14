class Solution {

    boolean func(int arr[], int mid) {
      long x = mid;
  
      for (int i = 0; i < arr.length; i++) {
          x = 2 * x - arr[i];
  
          if (x < 0)
              return false;
              
          // Prevent overflow
          if (x > 1_000_000_000_000_000_000L) {
              x = 1_000_000_000_000_000_000L;
          }
      }
  
      return true;
  }
  
      public int find(int[] arr) {
  
          int max = 0;
          for (int i : arr)
              max = Math.max(max, i);
  
          int l = 1;
          int h = max;
          int ans = max;
  
          while (l <= h) {
  
              int m = l + (h - l) / 2;
  
              if (func(arr, m)) {
                  ans = m;
                  h = m - 1;
              } else {
                  l = m + 1;
              }
          }
  
          return ans;
      }
  }