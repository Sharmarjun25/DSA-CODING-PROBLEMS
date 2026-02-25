class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
     Integer temp[] = new Integer[n];
     for(int i = 0 ; i < n ; i++){
        temp[i] = arr[i];
     }
     Arrays.sort(temp , (a,b) -> {
        int bitofa = Integer.bitCount(a);
        int bitofb = Integer.bitCount(b);
        if(bitofa == bitofb){
            return a-b;
        }
        return bitofa - bitofb;
     });

     for(int i = 0 ; i < n ; i++){
        arr[i] = temp[i];
     }
     return arr;
    }
}