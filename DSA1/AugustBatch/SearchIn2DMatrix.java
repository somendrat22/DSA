class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        
        for(int i  = 0; i < matrix.length; i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]){
                row = i;
                break;
            }
        }
        
        if(row == -1){
            return false;
        }
        
        for(int col  = 0; col < matrix[0].length; col++){
            if(matrix[row][col] == target){
                return true;
            }
        }
        
        return false;
    }
}
