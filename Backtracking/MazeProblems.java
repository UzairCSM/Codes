package Backtracking;

public class MazeProblems {
      public static int count(int r,int c){
          if(r==1 || c==1){
              return 1;
          }
          int left=count(r,c-1);
          int right=count(r-1,c);
          return left+right;
    }

    public static void main(String[] args) {
        int ans=count(3,3);
        System.out.println(ans);

    }

}
