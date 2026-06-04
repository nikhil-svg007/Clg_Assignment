//brute force
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        boolean[][] vis = new boolean[m][n];
        int[] dr = {0, 1, 0, -1}; // right, down, left, up
        int[] dc = {1, 0, -1, 0};
        int row = 0, col = 0, dir = 0;
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[row][col]);
            vis[row][col] = true;
            int nr = row + dr[dir];
            int nc = col + dc[dir];
            if (nr < 0 || nr >= m || nc < 0 || nc >= n || vis[nr][nc]) {
                dir = (dir + 1) % 4; // change direction
                nr = row + dr[dir];
                nc = col + dc[dir];
            }
            row = nr;
            col = nc;
        }
        return ans;
    }
}
//optimised
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                res.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}