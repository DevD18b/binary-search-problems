public class megnaticForceBetweenTwoBalls {
    public static int maxForce(int [] arr , int megnatic){

int low = 1;
int high = arr[arr.length-1]-arr[0];

int ans  = 0;
while(low<=high){

    int mid =(low+high)/2;

    int count = 1;
    int compare  = 0;
    for(int i =1; i<arr.length; i++){
       // int prevPosition = arr[compare];
        int diff = arr[i] -arr[compare];
        if(diff>=mid){
            count++;
            compare = i;
        }
    }
    if(count>=mid){
        ans = mid;
        low = mid+1;
    }
    else{
        high = mid-1;
    }

}
return ans;





    }
    
}
