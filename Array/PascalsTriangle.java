/*
https://leetcode.com/problems/pascals-triangle/
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int numCols = 1;
        int sum = 1;

        if (numRows == 1) {
            result.add(Arrays.asList(1));
            return result;
        } 
    
        //Iterate each row
        for(int i = 0; i < numRows; i ++) {
            //For each row create a new Inne rList
            List<Integer> innerList = new ArrayList<Integer>();
            //Iterate each column for per row
            for(int j = 0; j < numCols; j++) {
                 if(j == 0 || j == numCols-1) {
                    innerList.add(1);
                 }
                 else if(i-1 >= 1 && j < numCols) {
                    innerList.add(result.get(i-1).get(j - 1) + result.get(i-1).get(j));
                 }
            }
            if(numCols <= numRows)
                numCols = numCols+1;

            result.add(innerList); 
        }
        return result;
    }
}