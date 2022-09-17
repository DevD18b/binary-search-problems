public class kthMissingElementInsideArray {

    public static int  isPresent(int target , int [] arr ){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;






    }


    public static int find(int [] arr , int k){

        int i =1;

        while(k>0){
            if(isPresent(i,arr)==-1){
                k--;
            }
            i++;
        }
        return i-1;
    }
    
}
