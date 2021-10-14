package HW4;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid1 = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int perimeter1 = getIslandPerimeter(grid1); //16
        System.out.println(perimeter1);

        int[][] grid2 = {{1}};
        int perimeter2 = getIslandPerimeter(grid2); //4
        System.out.println(perimeter2);

        int[][] grid3 = {{1, 0}};
        int perimeter3 = getIslandPerimeter(grid3); //4
        System.out.println(perimeter3);

        int[][] grid4 = {{1, 1, 1, 1}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int perimeter4 = getIslandPerimeter(grid4); //18
        System.out.println(perimeter4);

        int[][] grid5 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int perimeter5 = getIslandPerimeter(grid5); //16
        System.out.println(perimeter5);
    }

    public static int getIslandPerimeter(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        result -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }

        return result;
    }
}
