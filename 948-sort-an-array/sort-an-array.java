class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        merge(nums , 0 , n-1);
        return nums;

    }
    private void merge(int[] nums , int low , int high){
        if(low < high){
            int mid = low + (high - low)/2;
            merge(nums , low , mid);
            merge(nums , mid+1 , high);
            mergesort(nums , low , mid , high);
        }
    }
    private void mergesort(int[] nums , int low , int mid , int high){
        //int n1 = mid -
        int n1 =  mid - low + 1;
        int n2 = high - mid;
        int[] l1 = new int[n1];
        int[] l2 = new int[n2];
        for(int i = 0 ; i < n1 ; i++){
            l1[i] = nums[low + i];
        }
        for(int j = 0 ; j < n2 ; j++){
            l2[j] = nums[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while(i < n1 && j < n2){
            if(l1[i] <= l2[j]){
                nums[k++] = l1[i++];
            }else{
                nums[k++] = l2[j++];
            }
        }
        while(i < n1){
            nums[k++] = l1[i++];
        }
        while(j < n2){
            nums[k++] = l2[j++];
        }

    }
}