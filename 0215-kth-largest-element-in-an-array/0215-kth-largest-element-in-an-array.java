class Solution {
    static void swap(int []arr,int val1,int val2){
        int temp=arr[val1];
        arr[val1]=arr[val2];
        arr[val2]=temp;
    }
    static void max_heapify(int []arr,int parent_int,int scope){
        int left_int = parent_int*2+1;
        int right_int = parent_int*2+2;
        if(left_int>scope)      return ;
                if(left_int==scope)
                {
                        if(arr[left_int]>arr[parent_int])
                                swap(arr, left_int, parent_int);
                        return;
                }
                if(arr[left_int]>arr[parent_int] && arr[left_int]>arr[right_int])
                {
                        swap(arr,left_int,parent_int);
                        max_heapify(arr, left_int, scope);
                }
                else if(arr[right_int]>arr[parent_int])
                {
                        swap(arr,right_int,parent_int);
                        max_heapify(arr, right_int, scope);
                }
    }
    public int findKthLargest(int[] arr, int k) {
         int scope;
           int parent_int;
           int ind;

        scope=arr.length-1;
           for(parent_int=(scope-1)/2;parent_int>=0;parent_int--)
                max_heapify(arr,parent_int,scope);
        swap(arr,0,scope);
       int ctr;
        for(ctr=1;ctr<k;ctr++)
        {
         scope--;
        max_heapify(arr, 0, scope);
        swap(arr,0,scope);
       }
       return arr[arr.length-k];
    }
}