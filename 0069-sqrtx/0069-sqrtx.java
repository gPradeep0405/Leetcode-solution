class Solution {
    public int mySqrt(int x) {
        int low=1,high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            // long val=mid*mid;
            if((long)mid*mid==(long)x){
                return mid;
            }else if((long)mid*mid>(long)x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}