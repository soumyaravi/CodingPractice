class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if(m*n != r*c)
            return nums;
        int A[] = new int[m*n];
        int k=0;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++)
                A[k++]=nums[i][j];
        }
        k=0;
        int res[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                res[i][j] = A[k++];
        }
        return res;
    }
}