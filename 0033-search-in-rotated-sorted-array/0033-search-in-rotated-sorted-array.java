
class Solution {

    int binarySearch(int[] arr, int lo, int hi, int key) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == key) {
                return mid;
            } 
            else if (arr[mid] < key) {
                lo = mid + 1;
            } 
            else {
                hi = mid - 1;
            }
        }

        return -1;
    }

    public int search(int[] arr, int key) {

        int n = arr.length;

        // Find pivot
        int lo = 0;
        int hi = n - 1;
        int pivot = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                pivot = mid + 1;
                break;
            }

            if (arr[mid] >= arr[0]) {
                lo = mid + 1;
            } 
            else {
                hi = mid - 1;
            }
        }

        // Array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, 0, n - 1, key);
        }

        // Search in right sorted half
        if (key >= arr[pivot] && key <= arr[n - 1]) {
            return binarySearch(arr, pivot, n - 1, key);
        }

        // Search in left sorted half
        return binarySearch(arr, 0, pivot - 1, key);
    }
}