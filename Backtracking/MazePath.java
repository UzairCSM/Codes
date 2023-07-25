package Backtracking;

import java.util.ArrayList;

public class MazePath {
    public static void  Path(int r,int c,String sb){
        if(r==1 && c==1){
            //System.out.println(sb.toString());
            System.out.println(sb);
            return;
        }
        if(c>1)
          Path(r,c-1,sb+'R');
        if(r>1)
          Path(r-1,c,sb+'D');
        // Path(r-1,c,sb);
    }
   public static void PathDiagonal(int r, int c,String sb){
        if(r==1 && c==1){
            System.out.println(sb);
            return;
        }
        if(r>1 && c>1){
            PathDiagonal(r-1,c-1,sb+'X');
        }
        if(c>1){
            PathDiagonal(r,c-1,sb+'R');
        }
        if(r>1){
            PathDiagonal(r-1,c,sb+'D');
        }
   }
    public static ArrayList<String> UsingArrayList(int r,int c,String sb){
        if(r==1 && c==1){
            //System.out.println(sb);
            ArrayList<String> list=new ArrayList<>();
            list.add(sb);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(UsingArrayList(r-1,c-1,sb+'X'));
        }
        if(c>1){
            list.addAll(UsingArrayList(r,c-1,sb+'R'));
        }
        if(r>1){
            list.addAll(UsingArrayList(r-1,c,sb+'D'));
        }
        return list;

    }
    public static void PathwithObstacle(String p, boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            PathwithObstacle(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            PathwithObstacle(p+'R',maze,r,c+1);
        }

        
    }


    public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder();
        String sb="";
       // Path(3,3,sb);
        ArrayList<String> ans=UsingArrayList(3,3,sb);
        boolean [][] board= {{true, true, true},
                {true, false, true},
                {true, true, true}
        };
        PathwithObstacle("",board,0,0);

        System.out.println(ans);
    }
}
