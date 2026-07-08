class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
       /* int k = (int)Math.ceil(n*0.05);
        int[] result = new int[n];
        for(int i = 0 ; i < k ; i++){

        }*/
        int start = n * 5 / 100;
        int end = arr.length - start;
        double total = end - start;
        double sum = 0;
        for(int i = start ; i < end ; i++){
            sum += arr[i];
        }
        return sum/total;

    }
}