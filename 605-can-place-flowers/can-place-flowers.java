class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {

/*
        if(arr[0] == 0){
            for(int i = 0 ; i < arr.length-1 ; i++){
                if(arr[i] == 0 && arr[i+1] != 1){
                    n = n-1;
                    arr[i] = 1;
                }
            }
        }else{
            for(int i = 1 ; i < arr.length-1 ; i++){
                if(arr[i] == 0 && arr[i-1] != 1 && arr[i+1] != 1){
                    n = n-1;
                    arr[i] = 1;
                }
           /* if(n == 0){
                return true;
            }*/
            //}

        //}
        for(int i = 0 ; i < arr.length ; i++){
            boolean left = (i == 0 || arr[i-1] == 0);
            boolean right = (i  == arr.length-1 || arr[i+1] == 0);
            if(arr[i] == 0 && left && right){
                //n = n-1;
                arr[i] = 1;
                n=n-1;
            }
        }
        
        if(n <= 0){
            return true;
        }else{
            return false;
        }
    }
}