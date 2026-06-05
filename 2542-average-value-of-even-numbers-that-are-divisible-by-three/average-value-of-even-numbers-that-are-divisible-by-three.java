class Solution {
    public int averageValue(int[] arr) {
        int n = arr.length;
         int sum  = 0;
        int count  = 0;
        for(int i = 0 ; i < n ; i++){
            if( arr[i] % 6 == 0){
                //if(arr[i] % 2 == 0){
                    sum = sum + arr[i];
                    count++;

                //}
                
            }

        }
       /* int ans = sum/count;
       // return sum / count;
       return ans;*/
       if(count > 0){
        return sum / count;
       }else{
        return 0;
       }
    }
}