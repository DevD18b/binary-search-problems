public class sqrtOfNumber {

    public static int find(int num){
        // int ans = (int) Math.sqrt(num);
        // return ans;
        if(num==1 || num==0) return num;
        int start  =1 ;
        int end = num;
        int ans = 0;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid*mid==num){
                return mid;
            }
            else if(mid*mid<=num){
                ans  = mid;
                start  = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        System.out.println(find(5));
    }
    
}
