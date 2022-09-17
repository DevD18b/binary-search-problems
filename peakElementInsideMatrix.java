
public class peakElementInsideMatrix {
    
    public static int [] findPeak(int [][] grid){
int row  = grid.length;


int start = 0;
int end = grid[0].length-1;
while(start<=end){
    int mid = start+(end-start)/2;
    int index  = 0;

    for(int i =0; i<row; i++)
    if(grid[index][mid] < grid[i][mid]){
      index  = i;
    }
    else if((mid==0 || grid[index][mid] > grid[index][mid-1]) && (mid==row-1 || grid[index][mid]>grid[index][mid+1])){
             return new int[]{row,mid};
    }
    else if(mid>0 && grid[row][mid] < grid[row][mid-1]){
        end = mid-1;
    }
    else{
        start  = mid+1;
    }
}
return new int[]{-1,-1};
}

}

