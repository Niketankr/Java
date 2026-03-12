public class TowerOfHanoi {

    static void solve(int n, char source, char helper, char dest) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }

        solve(n - 1, source, dest, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + dest);

        solve(n - 1, helper, source, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        solve(n, 'A', 'B', 'C');
    }
}
output:
Move disk 1 from A to C
Move disk 2 from A to B
Move disk 1 from C to B
Move disk 3 from A to C
Move disk 1 from B to A
Move disk 2 from B to C
Move disk 1 from A to C


public class NQueens {

    static int N = 4;

    static boolean isSafe(int board[][], int row, int col) {

        for (int i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (int i=row, j=col; i>=0 && j>=0; i--, j--)
            if(board[i][j]==1)
                return false;

        for (int i=row, j=col; j>=0 && i<N; i++, j--)
            if(board[i][j]==1)
                return false;

        return true;
    }

    static boolean solve(int board[][], int col) {

        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {

                board[i][col] = 1;

                if (solve(board, col + 1))
                    return true;

                board[i][col] = 0;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int board[][] = new int[N][N];

        if (solve(board, 0)) {

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(board[i][j] + " ");
                System.out.println();
            }
        }
    }
}
ouput:
0 0 1 0 
1 0 0 0 
0 0 0 1 
0 1 0 0 


public class RatMaze {

    static int N = 4;

    static boolean solveMaze(int maze[][], int x, int y, int sol[][]) {

        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1) {

            sol[x][y] = 1;

            if (solveMaze(maze, x + 1, y, sol))
                return true;

            if (solveMaze(maze, x, y + 1, sol))
                return true;

            sol[x][y] = 0;
        }

        return false;
    }

    public static void main(String args[]) {

        int maze[][] = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int sol[][] = new int[N][N];

        solveMaze(maze, 0, 0, sol);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }
}

output:
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 1 


