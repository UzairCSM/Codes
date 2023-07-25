package Codechefandleetcode;

public class Mazeproblems {
     public static int mazecount(int x,int y,int n){
         if(x==n-1 || y==n-1){
             return 1;
         }
         int left=mazecount(x+1,y,n);
         int right=mazecount(x,y+1,n);
         return left+right;
     }

    public static void main(String[] args) {
        int x=0;
        int y=0;
        int n=5;
        int ans=mazecount(x,y,n);
        System.out.println(ans);
    }

}
