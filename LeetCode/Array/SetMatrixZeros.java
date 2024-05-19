import java.util.ArrayList;
class Solution {
    public void setZeroes(int[][] matrix) {
        //number of rows
        int m = matrix.length;
        //number of cols
        int n = matrix[0].length;

        ArrayList<Integer> rowToZero = new ArrayList<Integer>();
        ArrayList<Integer> colToZero = new ArrayList<Integer>();

        //Identify the rows and columns to set to zero in original array
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 0) {
                    rowToZero.add(i);
                    colToZero.add(j);
                }
            }
        }

        //set row values to zero -- one row at a time from 0 to n
        for(int row : rowToZero) {
            for(int col = 0; col < n; col++) {
                matrix[row][col] = 0;
            }
        }  

        //set column values to 0 -- one col at a time from 0 to m
        for(int col : colToZero)  {
            for(int row = 0; row < m; row++) {
                matrix[row][col] = 0;
            }
        }
    }
   
}