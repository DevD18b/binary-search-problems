import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
public class kthElementOfTwoSortedArray {
    // a brute force approach to solve this problem is :
    // add element to dsa.
    // sort and return the element at index k-1.
    public static int find(int [] arr1 , int [] arr2 , int k)
    {
        // tc -->  o(n) + o(m) + log(n+m) + o(1).

        ArrayList<Integer> ansList = new ArrayList<>();

        for(int i : arr1) ansList.add(i);
        for(int j : arr2) ansList.add(j);

        Collections.sort(ansList);

        return ansList.get(k-1);
    }

    // better approach is using the min heap priority Queue.
    public static int findAns(int [] arr1 , int [] arr2 , int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr1) pq.add(i);
        for(int j : arr2) pq.add(j);



        while(k-->1){
            pq.remove();
        }
        return pq.peek();







    }
    // lets try to solve this problem efficiently. using binary search algorithm.
      // where  the tc drains out to almost --> o(log(n)+log(m)).

      public static int kthElement(int [] arr1 , int [] arr2 , int m ,int n , int k){
        if(m>n)  return kthElement(arr1, arr2, m, n , k);
        int low = Math.max(0 , k-m);
        int high =  Math.max(k, n);
        while(low<=high){
            int cut1 = (low+high)/2;
            int cut2 = k -cut1;

            int l1 = cut1==0 ? Integer.MIN_VALUE : arr1[cut1-1];
            int l2 = cut2==0 ? Integer.MIN_VALUE : arr2[cut2-1];
            int r1 = cut1==m ? Integer.MAX_VALUE : arr1[cut1];
            int r2  = cut2==n ? Integer.MAX_VALUE : arr2[cut2];


            if(l1<=r2 && l2<=r1){
                return Math.max(l1, l2);
            }
            else if(l1>r2){
                high = cut1-1;
            }
            else{
                low = cut1+1;
            }
        }
        return -1;
      }





    public static void main(String[] args) {
        
    }
    
}
