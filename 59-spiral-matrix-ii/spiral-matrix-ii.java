class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int num = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res[i][right] = num++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res[i][left] = num++;
                }
                left++;
            }
        }
        return res;
    }
}








































// int[][] res
//         while(top<=bottom && left<=right){
//             for(int i=left;i<=right;i++){
//                 res.add(matrix[top][i]);
//             }
//             top++;
//             for(int i=top;i<=bottom;i++){
//                 res.add(matrix[i][right]);
//             }
//             right--;
//             if(top<=bottom){
//                 for(int i=right;i>=left;i--){
//                     res.add(matrix[bottom][i]);
//                 }
//                 bottom--;
//             }
//             if(left<=right){
//                 for(int i=bottom;i>=top;i--){
//                     res.add(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }