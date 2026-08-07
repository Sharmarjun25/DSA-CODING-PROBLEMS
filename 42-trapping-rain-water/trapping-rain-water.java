class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        /*(for(int i = 0 ; i < n ; i++){
            int maxleft = 0;
            int maxright = 0;
            for(int j = 0 ; j <= i ; j++){
                if(height[j] > maxleft){
                    maxleft = height[j];
                }
            }
            for(int j = i ; j < n ; j++){
                if(height[j] > maxright){
                    maxright = height[j];
                }
            }
            total += Math.min(maxleft , maxright) - height[i];

        }*/
        int l = 0 , r = n-1,lmax = 0, rmax = 0;
        while(l < r){
            if(height[l] <= height[r]){
                if(lmax > height[l]){
                    total = total + (lmax - height[l]);
                }else{
                    lmax = height[l];
                }
                l++;
            }else{
                if(rmax > height[r]){
                    total = total + (rmax - height[r]);
                }else{
                    rmax = height[r];
                }
                r--;
            }
            //return total;
        }
        return total;

        
    }
}