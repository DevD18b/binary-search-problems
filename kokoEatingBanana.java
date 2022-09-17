
public class kokoEatingBanana {
    public static boolean canEatInGivenTime(int [] piles, int k , int hours){
        int countHours = 0;
        for(int pile : piles){
            if(pile<=k){
                countHours++;
            }
            else{
            if(pile%k==0){
                countHours +=  pile/k;
            }
            else{
                countHours+=(pile/k)+1;
            }
        }

            if(countHours>hours) return false;
        }
        return true;
    }
    public static int eatingBanana(int [] piles , int hours){

        int start =1;
        int high = -1;
        int ans = -1;

        for(int i =0; i<piles.length; i++){
            if(piles[i]>high){
                high = piles[i];
            }
        }
        while(start<=high){
            int mid = (start+high)/2;
        if(canEatInGivenTime(piles, mid, hours)){
            ans = mid;
            high = mid-1;
        }
        else{
            start= mid+1;
        }
        }
        return ans;


    }
//      Koko loves to eat bananas. 
// There are n piles of bananas, the ith pile has piles[i] bananas. 
// The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. 
// Each hour, she chooses some pile of bananas and eats k bananas
//  from that pile. If the pile has less than k bananas, 
//  she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to 
// finish eating all the bananas before the guards return.

// Return the minimum integer k such 
// that she can eat all the bananas within h hours.
}
