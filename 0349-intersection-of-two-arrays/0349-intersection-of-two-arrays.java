class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for(int ele: nums1){
            arr.add(ele);
        }
        for(int ele:nums2){
            if(arr.contains(ele)){
                ans.add(ele);
            }
        }
        int[] result = new int[ans.size()];
        int i =0;
        for(int ele : ans){
            result[i] = ele;
            i++;
        }
        return result;
    }
}