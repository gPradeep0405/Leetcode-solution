class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max2=max1;
                max1=nums[i];
                // System.out.print("i: ");
            }else if(max2<nums[i] && max1>=nums[i]){
                max2=nums[i];
                // System.out.print("j: ");

            }
            // System.out.println(max1+" "+max2);
        }
        return (max1-1)*(max2-1);
    }
}