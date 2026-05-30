class Solution {
    public long perfectPairs(int[] nums) {
       /* int n = nums.length;
        long count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                int a = nums[i];
                int b = nums[j];
                if(i < j){
                    if(Math.min(Math.abs(a-b) , Math.abs(a+b)) <= Math.min(Math.abs(a) , Math.abs(b)) && Math.max(Math.abs(a-b) , Math.abs(a+b)) >= Math.max(Math.abs(a) , Math.abs(b))){
                        count++;
                    }
                }
            }
        }
        return count;*/
         long count = 0;
        int n = nums.length;
        long[] arr = new long[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = Math.abs((long)nums[i]);
        }
        Arrays.sort(arr);
        /*
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if( arr[j] <= 2 * arr[i]){
                    count = count + (j-i-1);
                }
            }
        }*/
        int j = 0;
        for(int i = 0 ; i < n ; i++){
           while(j < n && arr[j] <= 2 *arr[i] ){
            j++;
            count += (j-1-i);
            //j++;
           }
        }
        return count;
    }
}