class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int ele : nums) {

            // First two elements are always allowed
            if (i < 2) {
                nums[i] = ele;
                i++;
            }

            // Allow the element if it is different
            // from the element two positions behind
            else if (ele != nums[i - 2]) {
                nums[i] = ele;
                i++;
            }
        }

        return i;
    }
}