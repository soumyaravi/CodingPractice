class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;
        int col[] = new int[grid.length];
        int row[] = new int[grid.length];
        
        for(int i=0;i<grid.length;i++){
            int maxc = 0, maxr = 0;
            for(int j=0;j<grid.length;j++){
                maxc = Math.max(maxc,grid[j][i]);
                maxr = Math.max(maxr,grid[i][j]);
            }
            col[i] = maxc;
            row[i] = maxr;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int diff = Math.min(col[j],row[i]) - grid[i][j];
                count+= diff > 0 ? diff : 0;
            }
        }
        return count;
    }
}