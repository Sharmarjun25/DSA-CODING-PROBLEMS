class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
       /* List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < n1 ; i++){
            int ind = -1;
            //int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < n2 ; j++){
                if(nums1[i] == nums2[j]){
                    ind = j;
                    break;
                }
            }
                    int greater = -1;

        

            for(int k = ind+1 ; k < n2 ; k++){
                if(nums2[k] > nums2[ind]){
                    greater = nums2[k];
                    //result.add(greater);
                    break;
                }
                //result.add(greater);
            }
            result.add(greater);
        }
        //return new int[]{list.toArray(result)};
        return result.stream().mapToInt(Integer::intValue).toArray();
        */
        int[] nge = new int[nums2.length];
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i = n2-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }
            map.put(nums2[i] , nge[i]);
            st.push(nums2[i]);
        }
        //return nge;
        int[] result = new int[nums1.length];
        for(int i = 0 ; i < n1 ; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;

    }
}