class Solution {
    
    class data{
        int st;
        int end;
        int pos;
        
        data(int st,int end, int pos){
            this.st=st;
            this.end=end;
            this.pos=pos;
            
        }
        
    }
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        
        // code here
        
        ArrayList<Integer> list= new ArrayList<>();
        
        data arr[]=new data[s.length];
        
        for(int i=0;i<s.length;i++){
            arr[i]=new data(s[i],f[i],i+1);
           
            
        }
        
        Arrays.sort(arr,(a,b)-> a.end-b.end);
        
        int ft=arr[0].end;
       list.add(arr[0].pos);
        for(int i=1;i<s.length;i++){
            if(arr[i].st>ft){
                list.add(arr[i].pos);
                ft=arr[i].end;
            }
        }
        
        Collections.sort(list);
        return list;
        
        
        
    }
}