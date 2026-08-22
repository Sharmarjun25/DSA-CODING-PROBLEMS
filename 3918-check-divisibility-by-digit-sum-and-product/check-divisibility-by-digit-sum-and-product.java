class Solution {
    public boolean checkDivisibility(int n) {
        int pro = 1;
        int sum = 0;
       // boolean flag = true;
        
        int b = n;
        while (n > 0) {
            
            int a = n % 10;
            pro = pro * a;
            sum += a;
            n = n/10;
            
        }
        int x = pro + sum;
        if (b % x == 0) {
            return true;
                
                
        }else{
            return false;
        }
        /*if(flag) {
            return true;
        } else {
            return false;
        }*/
    }
}