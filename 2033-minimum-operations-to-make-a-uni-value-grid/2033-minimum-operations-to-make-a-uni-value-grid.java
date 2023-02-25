import java.util.*;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] grid_arr = new int[m * n];
        List<Integer> grid_list = new ArrayList<>();

        // grid element 1차월배열 전환
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid_list.add(grid[i][j]);
            }
        }

        grid_arr = grid_list.stream().mapToInt(Integer::intValue).toArray();

        // 오름차순 후 중간값 구하기
        Arrays.sort(grid_arr);
        int avg = grid_arr[grid_arr.length / 2];

        // 연산횟수 구하기
        int count = 0;
        for (int k = 0; k < grid_arr.length; k++) {
            int sub = Math.abs(grid_arr[k] - avg);
            if (sub % x != 0) {
                return -1;
            }
            count += sub / x;
        }

        return count;
    }
}