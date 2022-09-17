public class AggresiveCows {

public static int largestMinDistance(int [] arr , int k ){

int n = arr.length;
int low =1;
int high = arr[n-1]-arr[0];
int ans= 0;
while(low<=high){
    int mid = (low+high)/2;
    if(canPlaceCows(arr , mid , k)){
       ans = mid;
       low = mid+1;
    }
    else{
        //low =  mid+1;
        high = mid-1;
    }
}
return ans;
}
public static boolean canPlaceCows(int [] arr , int mid , int cows){

int k= arr[0];
int count = 1;

for(int i =1; i<arr.length; i++){
    if(arr[i]-k>= mid){
        count++;
        k = arr[i];
    }
}
if(count>=cows) return true;

return false;

}
public static void main(String[] args) {
    int [] arr = {1,2,4,8 ,9};
    int k =  3;
    System.out.println(largestMinDistance(arr, k));
}


    
}
