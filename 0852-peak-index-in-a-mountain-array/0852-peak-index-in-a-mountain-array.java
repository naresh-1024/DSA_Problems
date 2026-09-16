class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=1;
        int end=arr.length-2;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]<arr[mid-1])
                end=mid-1;
            else
                st=mid+1;
        }
        return -1;

    }
}