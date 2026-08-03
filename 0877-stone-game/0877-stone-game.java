class Solution {
    public boolean stoneGame(int[] nums) {
        
        int n=nums.length;
        boolean[] temp=new  boolean[n];
        int alice=0,bob=0;
        for(int i=0;i<n/2;i++){
            int  max1=Integer.MIN_VALUE;
            int  max2=Integer.MIN_VALUE;
            int ind1=0,ind2=0;
            for(int j=0;j<n;j++){
                if(max1<nums[i]){
                    max2=max1;
                    max1=nums[i];
                    ind2=ind1;
                    ind1=i;
                }else if(max2<nums[i] && max1>=nums[i]){
                    max2=nums[i];
                    ind2=i;
                }
            }
            if(!temp[ind1]){
                temp[ind1]=true;
                alice+=max1;
            }
            if(!temp[ind2]){
                temp[ind2]=true;
                bob+=max2;
            }

        }
        return alice>=bob? true:false;
    }
}