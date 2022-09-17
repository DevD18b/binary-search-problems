

public class binarySearchToFindXInSortedArray{

    public static int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                right = mid-1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            
        }
        return -1;
        
        
        
    }
    public static void main(String[] args) {
        int [] arr = {4,7,8,6,9,3,1};
       // System.out.println(search(arr, 9));
         int target = 9;
        int ans = search(arr, target);
        System.out.println(ans);

    }
}