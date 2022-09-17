import java.util.ArrayList;

public class countOccuranceOfelement {

    public static ArrayList<Integer> findOccurance(int [] arr , int key){

int target =key;
int n  = arr.length;
        int first  = find(arr, target, n, true);
        int last =  find(arr, target, n, false);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return
        ans;
    }
    public static int find(int [] arr , int target , int n , boolean isLeft){
        int left = 0;
        int res = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+(right-left)/2);
            if(arr[mid]==target){
               res = mid;
               if(isLeft){
                right=mid-1;
               }
               else{
                left = mid+1;
               }
}
if(arr[mid]<target){
    left = mid+1;
}
else{
right  =mid-1;
}

        }

        return res;
    }
   
    
}
