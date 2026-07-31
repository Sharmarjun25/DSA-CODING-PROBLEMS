class Solution {


    private int binarySearch(List<Integer> arr , int target){
        int left = 0;
        int right = arr.size() - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr.get(mid) == target){
                return mid;

            }else if(arr.get(mid) > target){
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }





    public int lengthOfLIS(int[] nums) {
        //int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            if(list.isEmpty() || list.get(list.size()-1) < n){
                list.add(n);
            }else{
                int m = binarySearch(list , n);
                list.set(m , n);
            }
        }
        return list.size();       
        
    }
}