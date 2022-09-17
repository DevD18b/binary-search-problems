public class findHowManyTimesAnArrayIsRotated {

public static int find(int [] arr , int n){
    int low =  0;
    int high = n-1;

    while(low<=high){
        int mid = (low)+(high-low)/2;

        if(mid>0 && arr[mid]<arr[mid-1]){
            return mid;
        }

        if(arr[high]>arr[mid]){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    }
    return low;
}



    
}
