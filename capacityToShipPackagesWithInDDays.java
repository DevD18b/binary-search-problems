public class capacityToShipPackagesWithInDDays {
    // A conveyor belt has packages that must be shipped from 
    // one port to another within days days.

    // The ith package on the conveyor belt has a weight of weights[i]. Each day, 
    // we load the ship with packages on the conveyor belt 
    // (in the order given by weights). 
    // We may not load more weight than the maximum weight capacity of the ship.
    
    // Return the least weight capacity of the ship that 
    // will result in all the packages on the conveyor belt 
    // being shipped within days days.
    //Input: weights = [1 2 1], days = 2
public static int ship(int [] arr , int n , int D){

    // suppose meh worst case meh mere pass ek hi din hai so what i need to do is i need to take all the 
    // weight[i] on day1 iteself. that is 2+1+1.

    // best case may be i have multiple days  and will take the maximum weight items at first and then take the minimum weight in remaining days
    // there for i took start  - max value.

    int start  = arr[0];
    for(int i : arr){
        start  = Math.max(start, i);
    }
    int end  = 0;
    int sum =0;
    for(int i =0; i<arr.length; i++){
        sum+=arr[i];
    }
    int res = -1;
    end = sum;


    while(start<=end){
        int mid = (start+end)/2;
        if(isPossible(arr, n , D , mid)){
            res = mid;
            end =mid-1;
        }
        else{
            start= mid+1;
        }
    }
    return res;
    }
    public static boolean isPossible(int [] arr , int n , int days , int max){
        int store  = 1;
        int sum =0;

        for(int i: arr){
            if(sum+arr[i]<=max){
                sum+=arr[i];
            }
            else{
                sum = arr[i];
                store++;
            }
        }
        if(store<=days) return true;
        return false;
    }
    
}
