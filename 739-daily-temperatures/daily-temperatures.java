class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        //Arrays.fill(res , 0);
        /*
        res[n-1] = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    res[i] = j - i;
                    break;
                }
            }
        }*/
        Stack<int[]> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[i] > st.peek()[0]){
                int[] ans = st.pop();
                res[ans[1]] = i - ans[1];
            }
            st.push(new int[]{arr[i] , i});
        }

        return res;
    }
}