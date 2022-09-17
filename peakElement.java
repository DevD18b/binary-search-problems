public class peakElement {
    public static int findPeak(int [] arr , int n){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start + (end-start)/2);

            if(mid==0){
                return arr[0]>arr[1]?0:1;
            }

            if(mid==n-1){
                return arr[n-1]>=arr[n-2]?n-1:n-2;
            }
         

            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
                 return mid;
            }

            if(arr[mid]<=arr[mid-1]){
                end =  mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    
}
