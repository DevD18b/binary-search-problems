public class binarySearchIn2DGrid {
    public static boolean  search(int [][] grid , int target){
int n = grid.length;
for(int i =0; i<n; i++){
    int start  = 0;
    int end  = grid[0].length-1;
    while(start<=end){
        int mid = (start+end)/2;
        if(grid[i][mid] == target){
            return true;
        }
        else if(grid[i][mid]>target){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
}
return false;
  }
  public static void main(String[] args) {
    int [][] grid = {{1,4,5},{3,2,6},{9,6,5}};
    int target  = 9;
     System.out.println(search(grid, target));
  }
    
}
