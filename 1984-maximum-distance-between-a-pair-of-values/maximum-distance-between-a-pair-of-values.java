class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int max = 0;
/*
        int max = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(i<= j && nums1[i] <= nums2[j]){
                    int diff = j - i;
                    max = Math.max(max , diff);
                }
            }
        }
        return max;*/
        int i = 0 , j = 0;
        while(i < n && j < m){
            if(i <= j && nums1[i] <= nums2[j]){
                int diff = j-i;
                max = Math.max(max , diff);
                j++;
            }else{
                if(i <= j && nums1[i] > nums2[j]){
                    i++;
                }else if(i > j){
                    j++;
                }
            }
        }
        return max;
    }

}