class Solution {

    public int[] findNSE(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                nse[i] = st.peek();
            }else{
                nse[i] = n;
            }
            st.push(i);
            
        }
        return nse;
        
    }

    public int[] findPSEE(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        return pse;

    }
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int mod = (int)(1e9 + 7);
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        for(int i = 0 ; i < n ; i++){
            int left = i - psee[i];
            int right =  nse[i] - i;;
            long freq = left * right * 1L;
            int val = (int)((freq*arr[i])%mod);
            sum = (sum + val) % mod;


        }

        /*for(int i = 0 ; i < n ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i ; j < n ; j++){
                min = Math.min(min , arr[j]);
                sum = (sum + min)% mod;
            }
            //sum = (sum + min) % mod;
        }*/
        return sum;
        
    }
}