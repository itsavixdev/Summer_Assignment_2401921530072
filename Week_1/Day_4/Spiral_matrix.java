//3. Spiral Matrix 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (left <= right && top <= bottom) {
            //right -> bottom -> left -> top
            //first right(top constant)
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            //then bottom(right constant)
            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
            }
            right--;
            //then left(bottom constant)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            //lastly top(left stays constant)
            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    result.add(matrix[j][left]);
                }
            }

            left++;
        }
        return result;
    }
}