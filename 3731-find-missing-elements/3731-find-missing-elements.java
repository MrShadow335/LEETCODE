class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        Arrays.sort(arr);
      List<Integer> ans = new ArrayList<>();
      HashSet<Integer> set = new HashSet<>();
      for(int ele:arr){
        set.add(ele);
      }
      int low = arr[0];
      int high = arr[arr.length-1];
      for(int i=low; i<= high; i++){
        if(!set.contains(i)){
            ans.add(i);
        }
      }
      return ans;
    }
}