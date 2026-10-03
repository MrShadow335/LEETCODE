class Solution {
    public void swap(int[] arr, int i, int rightIdx){
        int temp = arr[i];
        arr[i] = arr[rightIdx];
        arr[rightIdx] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int rightIdx = arr[i]-1;
            if(arr[i] != arr[rightIdx]){
                swap(arr,i, rightIdx);
            }
            else i++;
        }
        for(int ele:arr) System.out.print(ele +" ");
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1) ans.add(j+1);
        }
        return ans;
    }
}