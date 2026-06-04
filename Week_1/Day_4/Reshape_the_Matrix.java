//2. Reshape the Matrix 
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length * mat[0].length){
            return mat;
        }
        int [][] mat_reshape = new int[r][c];
        for(int i = 0; i < r*c; i++){
            mat_reshape[i/c][i%c] = mat[i/ mat[0].length][i% mat[0].length];
        }
        return mat_reshape;
    }
}