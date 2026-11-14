class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        //int sum = 0;
        int min = Integer.MAX_VALUE;

        //int res  = -1;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){

                /*int a = j-i+1;
                if(a >= l && a <= r){
                    sum = sum + nums.get(j);

                    if(sum > 0){
                        continue;
                    }else{
                        sum = 0;
                    }
                }else{
                    sum = 0;
                }*/
                sum += nums.get(j);
                int a = j-i+1;
                if(a >= l && a <= r && sum > 0){
                    min = Math.min(min , sum);
                }
                //if()

                //sum = sum + nums.get(j);     
            }
            //min = Math.min(min , sum);
        }
        //return min;   
        if(min == Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }
    }
}