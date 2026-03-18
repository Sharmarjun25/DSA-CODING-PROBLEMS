class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c1 = 0;
        int c2 = 0;
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].charAt(1) == '+' ){
                c1++;
            }else{
                c2--;
            }
        }
        return c1 + c2;
    }
}