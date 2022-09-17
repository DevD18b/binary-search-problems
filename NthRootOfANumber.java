
public class NthRootOfANumber {
    public static int multiply(int number , int n){
        int ans = 1;
        for(int i =1;i<=n; i++){
            ans = ans*number;
        }
        return ans;
    }
    public int NthRoot(int n, int m)
    {
        // code here
int start  =1;
int end = m;
while(start<=end){
    int mid = (start+end)/2;
    int value = (int) Math.pow(mid, n);
    if(value==m) return mid;
    if(value<m) start = mid+1;
    else end = mid-1;
}
return -1;


    }
}
