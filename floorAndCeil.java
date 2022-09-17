public class floorAndCeil {

public static pair findFloorAndCeil(int [] arr , int n , int x){
 pair p = new pair(getFloor(arr, x, n), getCeil(arr, x, n));
 return p;
}

public static int getCeil(int [] arr , int x , int n){
    int low = 0;
    int high = arr.length-1;
    int ans = -1;
 
    while(low<=high){
        int mid = (low)+(high-low)/2;

        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
          ans = arr[mid];
          high  = mid-1;
        }
        else{
           low = mid+1;
        }
     }
     return  ans;



}

public static int getFloor(int [] arr , int x , int n){
    int low = 0;
    int high = arr.length-1;
     int ans = -1;
    while(low<=high){
        int mid  = low + (high-low)/2;

        if(arr[mid] == x){
            return mid;
        }
        if(arr[mid]<x){
            ans = arr[mid];
             low = mid+1;
        }
        else{
            high  =  mid-1;
        }
    }
    return ans;  
}

    
}

class pair{
    int floor;
    int ceil;
    pair(int floor , int ceil){
        this.floor = floor;
        this.ceil = ceil;
    }
}
