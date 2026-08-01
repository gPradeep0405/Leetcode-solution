class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return arr[low%arr.length];

        // int left = 0;
        // int right = letters.length - 1;
        
        // while (left <= right) {
        //     int mid = left + (right - left) / 2;
        //     if (letters[mid] > target) {
        //         right = mid - 1;
        //     } else {
        //         left = mid + 1;
        //     }
        // }
        // return letters[left % letters.length];
    }
}