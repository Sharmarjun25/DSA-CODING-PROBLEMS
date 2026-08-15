class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int n =  nums.length;
        //int max = Integer.MIN_VALUE;
        /*for(int i = 0 ; i <= n-k ; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i ; j < i+k ; j++){
                max = Math.max(max , nums[j]);
                //list.add(max);
            }
            list.add(max);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();*/
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();

            }
            dq.offerLast(i);
            if(i >= k-1){
                result.add(nums[dq.peekFirst()]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}