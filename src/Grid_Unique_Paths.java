public class Grid_Unique_Paths {

// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
//
//Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
//
//The test cases are generated so that the answer will be less than or equal to 2 * 109.
//
//
//
//Example 1:
//
//
//Input: m = 3, n = 7
//Output: 28
//Example 2:
//
//Input: m = 3, n = 2
//Output: 3

//Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down
//


    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
    private static int countPaths(int i, int j, int n, int m, int[][] matrix){
        if(i == n-1 && j == m-1) return 1;
        if(i >= n || j >= m) return 0;

        if(matrix[i][j] != -1) return matrix[i][j];

        matrix[i][j] = countPaths(i+1, j, n, m, matrix) + countPaths(i, j+1, n, m, matrix);
        return matrix[i][j];
    }

    private static int uniquePaths(int m, int n) {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = -1;
            }
        }

        return countPaths(0, 0, n, m ,matrix);
    }


}
