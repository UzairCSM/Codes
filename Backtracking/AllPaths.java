package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void allpath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // I am considering this block in my path
        maze[r][c]=false;

        if (r < maze.length - 1) {
            allpath(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            allpath(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allpath(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allpath(p + 'L', maze, r, c - 1);
        }
         // this line is where the function gets over
        // so before the function gets over also remove the changes that
        // were made by that function
        maze[r][c]=true;
    }
    public static void allpathinMatrix(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for(int[] arr:path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        // I am considering this block in my path
        maze[r][c]=false;
        path[r][c]=step;

        if (r < maze.length - 1) {
            allpathinMatrix(p + 'D', maze, r + 1, c,path,step+1);
        }
        if (c < maze[0].length - 1) {
            allpathinMatrix(p + 'R', maze, r, c + 1,path,step+1);
        }
        if (r > 0) {
            allpathinMatrix(p + 'U', maze, r - 1, c,path,step+1);
        }
        if (c > 0) {
            allpathinMatrix(p + 'L', maze, r, c - 1,path,step+1);
        }
        // this line is where the function gets over
        // so before the function gets over also remove the changes that
        // were made by that function
        maze[r][c]=true;
        path[r][c]=0;
    }

    public static void main(String[] args) {
        boolean[][] board = {{true, true, true},
                {true,true, true},
                {true, true, true}
        };
        int[][] path=new int[board.length][board[0].length];
       // allpath("", board, 0, 0);
        allpathinMatrix("",board,0,0,path,1);

    }
}
