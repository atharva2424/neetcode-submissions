class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length*matrix[0].length-1, mid = 0;
        while(l<=r)
        {
            mid = l + (r-l)/2;
            int m = mid/matrix[0].length;
            int n = mid%matrix[0].length;
            // if(m>=matrix.length || n>=matrix[0].length)
            // break;
            if(matrix[m][n]==target)
            return true;
            else if(matrix[m][n]<target)
            l = mid+1;
            else
            r = mid-1;
        }
        return false;
    }
}
