class Solution {
    public void reverse(int[] arr, int l, int h){
        while(l < h){
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i = 0;
        int j = nums.length - 1;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums,nums.length- k, nums.length-1);
        reverse(nums, 0, nums.length-1);

    }
}