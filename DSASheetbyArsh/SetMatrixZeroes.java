package DSASheetbyArsh;

public class SetMatrixZeroes {
        public void setZeroes(int[][] matrix) {
            int[][] visitedMatrix=new int[matrix.length][matrix[0].length];
            for(int i=0;i<visitedMatrix.length;i++){
                for(int j=0;j<visitedMatrix[0].length;j++){
                    visitedMatrix[i][j]=0;
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0 && visitedMatrix[i][j]==0){
                        up1_move(matrix,visitedMatrix,i,j);
                        down_move(matrix,visitedMatrix,i,j);
                        right_move( matrix, visitedMatrix, i,j);
                        left_move( matrix, visitedMatrix,i,j);
                    }
                }
            }
        }
        public static void up1_move(int[][] matrix,int[][] visited,int i,int j){
            for(int loop=i;loop>=0 ;loop--){
                if(matrix[loop][j]!=0)
                    visited[loop][j]=1;
                matrix[loop][j]=0;

            }
            return;
        }
        public static void down_move(int[][] matrix,int[][] visited,int i,int j){
            for(int loop=i;loop<matrix.length ;loop++){
                if(matrix[loop][j]!=0)
                    visited[loop][j]=1;
                matrix[loop][j]=0;
            }
            return;
        }
        public static void left_move(int[][] matrix,int[][] visited,int i,int j){
            for(int loop=j;loop>=0 ;loop--){
                if(matrix[i][loop]!=0)
                    visited[i][loop]=1;
                matrix[i][loop]=0;
            }
            return;
        }
        public static void right_move(int[][] matrix,int[][] visited,int i,int j){
            for(int loop=j;loop<matrix[0].length ;loop++){
                if(matrix[i][loop]!=0)
                    visited[i][loop]=1;
                matrix[i][loop]=0;
            }
            return;
        }
        // System.out.println(visitedMatrix);

    }
