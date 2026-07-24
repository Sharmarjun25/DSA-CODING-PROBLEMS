class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        //int[] result = new int[]
        //int n = nums1.length;
        int m = nums2.length;
        int k = nums3.length;

       // int a = Math.max(n , Math.max(m , k));
        /*HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            map.put(nums1[i] , map.getOrDefault(nums1[i] , 0) + 1);
        }
        for(int i = 0 ; i < m ; i++){
            map.put(nums2[i] , map.getOrDefault(nums2[i] , 0) + 1);
        }
        for(int i = 0 ; i < k ; i++){
            map.put(nums2[i] , map.getOrDefault(nums2[i] , 0) + 1);
        }
        for()*/
        HashSet<Integer> s1 = new HashSet<>();
         HashSet<Integer> s2 = new HashSet<>();

        HashSet<Integer> s3 = new HashSet<>();
        for(int n : nums1){
            s1.add(n);
        }
        for(int n : nums2){
            s2.add(n);
        }
        for(int n : nums3){
            s3.add(n);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : s1){
            if(s2.contains(n) || s3.contains(n)){
                set.add(n);
            }
        }
        for(int n : s2){
            if(s1.contains(n) || s3.contains(n)){
                set.add(n);
            }
        }
        return new ArrayList<>(set);





        
        
    }
}