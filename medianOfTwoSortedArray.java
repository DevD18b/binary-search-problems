public class medianOfTwoSortedArray {
    public static int findMedian(int [] arr1 , int []  arr2 , int n , int m){

        int  i =0;
        int j = 0;
        int  k = 0;
        int [] merge = new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
              merge[k++] = arr1[i++];
            }
            else{
                merge[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            merge[k++] = arr1[i++];
        }
        while(j<arr2.length){
            merge[k++] = arr2[j++];
        }
        
        n = n+m;
        if(n%2==1)
        return merge[((n+1)/2)-1];

        return (merge[(n/2)-1]+merge[n/2])/2;
    }
    
}
