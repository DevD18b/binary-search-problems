public class smallestDivisorWithSumUnderThreshHold {

public static int findNumber(int [] arr , int threshold){


    int start = 1;
    int end = 0;


    for(int i: arr){
        end = Math.max(i, end);
    }



    while(start<=end){
        int mid = (start+end)/2;


        int sum = 0;
        for(int i : arr){
        sum+= (i+mid-1)/mid;
        }
        if(sum>threshold){
            start = mid+1;
        }
        else{
            end = mid-1;
        }

    }
    return start;













}


    
}
