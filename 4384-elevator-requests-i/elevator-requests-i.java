class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum = 0;
        int m = requests.length;
        sum = sum + requests[0];
        for(int i = 1 ; i < m ; i++){
            int diff = Math.abs(requests[i] - requests[i-1]);
            sum = sum + diff;
        }
        return sum;
    }
}