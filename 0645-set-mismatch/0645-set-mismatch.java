class Solution {

    public void swap(int[] arr, int i, int rightIdx) {
        int temp = arr[i];
        arr[i] = arr[rightIdx];
        arr[rightIdx] = temp;
    }

    public int[] findErrorNums(int[] arr) {

        int n = arr.length;
        int[] ans = new int[2];

        int i = 0;

        while (i < n) {

            int rightIdx = arr[i] - 1;

            if (arr[i] != arr[rightIdx]) {
                swap(arr, i, rightIdx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {

            if (arr[j] != j + 1) {
                ans[0] = arr[j];   // duplicate
                ans[1] = j + 1;    // missing
                break;
            }
        }

        return ans;
    }
}