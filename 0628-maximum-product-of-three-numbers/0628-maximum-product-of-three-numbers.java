class Solution {
    public int maximumProduct(int[] nums) {
        // int max3=Integer.MIN_VALUE;
        // int max2=Integer.MIN_VALUE;
        // int max1=Integer.MIN_VALUE;

        // Arrays.sort(nums);

        // int n = nums.length;

        // int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        // int p2 = nums[0] * nums[1] * nums[n - 1];

        // return Math.max(p1, p2);

        Arrays.sort(nums);
        int n=nums.length;
        int p1=nums[n-1]*nums[n-2]*nums[n-3];
        int p2=nums[0]*nums[1]*nums[n-1];
        return Math.max(p1,p2);
        // if(nums.length==3){
        //     return nums[0]*nums[1]*nums[2];
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(max1<nums[i]){
        //         max3=max2;
        //         max2=max1;
        //         max1=nums[i];
        //     }else if(max1>nums[i] && max2<nums[i]){
        //         max3=max2;
        //         max2=nums[i];
        //     }else{
        //         max3=nums[i];
        //     }
        // }
        // return max1*max2*max3;
    }
}