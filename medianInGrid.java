public class medianInGrid {
    public static int findMedian(int [][] grid)
    {

        // brute force solution is to store all the element in sorted order inside 
        // a arraylist.
        // and return the element which is at size/2;

        int row = grid.length;
        int col = grid[0].length;
        int [] ans = new int[row*col];
        int index= 0;
        for(int i =0; i<row; i++){
            for(int j= 0; j<col; j++){
               ans[index++] = grid[i][j];
            }
        }
        return ans[(row*col)/2];
    }
    public static void main(String[] args) {
        int [][] grid = {{2,3,1},{4,9,2},{6,7,9}};
        System.out.println(findMedian(grid));
    }
    
}
