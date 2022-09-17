import java.util.Arrays;

public class splitArrayLargestSum {
    
    // we will solve it first using the 
    // dp 
    
    public int splitArray(int[] nums, int m) {


        int [][] memo = new int[nums.length+1][m+1];

        for(int i =0; i<nums.length; i++){
            Arrays.fill(memo[i], -1);
        }
        return helper(nums ,  0 , m , memo);


    }


    public static int helper(int [] nums , int index , int m , int [][] memo){


        if(index==nums.length && m==0) return 0;

        if(index==nums.length || m==0) return Integer.MAX_VALUE;


        if(memo[index][m]!=-1) return memo[index][m];
        int n = nums.length;
        int ret  = Integer.MAX_VALUE;
        int curSum = 0;

        for(int i = index; i<n; i++){
            curSum+=nums[i];

         int futureSum = helper(nums, index+1, m-1,memo);

         ret = Math.min(ret, Math.max(curSum, futureSum));
        }
        memo[index][m] = ret;
        return ret;

    }

// now we will be going to use the binary search to solve this problem.
public int splitArraySum(int[] nums, int m) {
        
        
    int low   = 0;
    int high  = 0;
    
    for(int i : nums){

        high +=i;
        low =  Math.max(i , low);
    
    }
   // int ans = 0;
    
    while(low<high){
        int mid = (low+high)/2;
        
        
        int count  = 1;
        int subSum = 0;
        int limit = mid;
        
        for(int num : nums){
            
            if(subSum+num<=limit){
                subSum=subSum+num;
            }
            else{
                count++;
                subSum= num;
            }
            
        }
        
        if(count>mid){
           low = mid+1;
        }
        
        else{
           high = mid;
        }
    
    }
    
    return low;
         
}












    
}
