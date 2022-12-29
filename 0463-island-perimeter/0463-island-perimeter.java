class Solution {
    static int[][] move = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 상하좌우
    public int islandPerimeter(int[][] grid) {
        int sideLength = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    sideLength += bfs(grid, i, j);
                }
            }
        }
        return sideLength;
    }
    
    private static int bfs(int[][] grid, int xValue, int yValue) {
        int cnt = 0;
        Position position = new Position(xValue, yValue);
        int x = position.x;
        int y = position.y;
        // 주변에 1인 것들 개수 카운트
        for (int i = 0; i < move.length; i++) {
            int nowX = x + move[i][0];
            int nowY = y + move[i][1];

            if (chk(nowX, nowY, grid.length, grid[0].length)) {
                if (grid[nowX][nowY] == 1) {
                    cnt++;
                }
            }
        }
        return 4 - cnt;
    }
    
    private static boolean chk(int x, int y, int x_length, int y_length) {
        if (x < 0 || y < 0 || x >= x_length || y >= y_length) return false;
        else return true;
    }
}

class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}