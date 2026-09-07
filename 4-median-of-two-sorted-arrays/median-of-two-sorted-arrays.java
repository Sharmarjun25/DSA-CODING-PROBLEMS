class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float ans = 0;
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n+m];
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(nums1[i]);
        }
        for(int i = 0 ; i < m ; i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            res[i] = list.get(i);
        }
        
        if(res.length % 2 == 0){
            int k = res[res.length / 2];
            int l = res[(res.length - 1) / 2];
            ans = (float)(k+l)/2;
        }else{
            ans = res[(res.length - 1)/2];
        }
        return ans;
        
    }
}