class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int area=0;
        int width;
        int height;
        int max_res=0;
        while(left < right)
        {
            height=Math.min(arr[left],arr[right]);
            width=right-left;
            area=height * width;
            if(area>max_res)
                max_res=area;
            if(arr[left] < arr[right])
                left++;
            else
                right--;
        }
        return max_res;
    }
}