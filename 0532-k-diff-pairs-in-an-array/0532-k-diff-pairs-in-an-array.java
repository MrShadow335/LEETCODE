class Solution {
    public int findPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            if (!map.containsKey(ele))
                map.put(ele, 1);
            else {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            }
        }

        int pairs = 0;

        if (k == 0) {
            for (int ele : map.keySet()) {
                if (map.get(ele) >= 2)
                    pairs++;
            }
        } 
        else {
            for (int ele : map.keySet()) {
                if (map.containsKey(ele + k))
                    pairs++;
            }
        }

        return pairs;
    }
}