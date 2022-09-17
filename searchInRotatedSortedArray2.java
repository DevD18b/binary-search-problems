public class searchInRotatedSortedArray2 {

    public static boolean search(int [] arr , int target){

        int low = 0;
        int high = arr.length;
    

        while(low<=high){
            int mid  = (low+high)/2;
            if(arr[mid] == target) return true;

            if(arr[mid]<arr[high]){
                if(arr[mid]<=target && arr[high]>=target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else if(arr[mid]>arr[high]){

                if(target>=arr[low] && target<=arr[mid]){
                    high = mid-1;
                }
                else{

                    low = mid+1;

                }

            }
            else{
                high--;
            }        
        }

        return false;



    }
    
}
