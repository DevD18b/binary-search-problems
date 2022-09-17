public class minimumNumberToMakeMBouquets {

    // You are given an integer array bloomDay, an integer m and an integer k.

    // You want to make m bouquets. 
    // To make a bouquet, you need to use k adjacent flowers from the garden.
    
    // The garden consists of n flowers, 
    // the ith flower will bloom in the bloomDay[i] and 
    // then can be used in exactly one bouquet.
    
    // Return the minimum number of days you need 
    // to wait to be able to make m bouquets from the garden. 
    // If it is impossible to make m bouquets return -1.


    public static boolean isPossible(int [] arr , int k , int m , int mid){
       int flower = 0;
       int bouquet = 0;
       for(int i : arr){
        if(i<=mid){
            flower++;
        }
        else{
            flower = 0;
        }
        if(flower>=k){
            bouquet++;
            flower = 0;
        }
        if(bouquet>=m){
            return true;
        }
       }
       return true;
    }

 public static int bloomDays(int [] arr , int  k , int m){


    int left = arr[0];
    int right = arr[0];

    for(int i : arr){
        left = Math.min(i ,left);
        right = Math.max(i, right);
    }
    int ans = -1;

    while(left<=right){
        int mid = (left+right)/2;


        if(isPossible( arr , k, m , mid)){
            ans  = mid;
           right  = mid-1;
        }
        else{
            left = mid+1;
        }
    }

    return ans;





 }


    
}
