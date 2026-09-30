class Solution {
    public int[][] transpose(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        int b[][] = new int[col][row];
        for(int i =0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                b[i][j] = mat[j][i];
            }
        }
        return b;
    }
}


