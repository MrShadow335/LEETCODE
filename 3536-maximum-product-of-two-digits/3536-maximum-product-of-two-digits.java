class Solution {
    public int maxProduct(int n) {
        int size = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(n != 0){
            arr.add(n%10);
            n=n/10;
            size++;
        }
        Collections.sort(arr);
        return (arr.get(size-1) * arr.get(size-2));
    }
}