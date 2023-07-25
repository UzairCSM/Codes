package Codechefandleetcode;

public class Patternquestion {
  //  public class PatternQuestions {
        public static void main(String[] args) {
            pattern(5);
        }
        public static void pattern(int n) {
            for(int i=1;i<=n;i++){
                int total_stars=i<n?i:2*n-i;
                int total_spaces=n-i;
                // int total_columns=i<n?i:2*n-i;
                for(int j=1;j<=total_spaces;j++){
                    System.out.print("  ");
                }
                //  int total_stars=i<n?i:2*n-i;
                for(int k=i;k>=1;k--){
                    System.out.print(k+" ");
                }
                for(int l=2;l<=i;l++){
                    System.out.print(l+" ");
                }
                System.out.println();
            }
        }
    }
