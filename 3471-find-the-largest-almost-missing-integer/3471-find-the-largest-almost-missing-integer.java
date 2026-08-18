class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] tem=new int[nums.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<i+k;j++){
                tem[j]++;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<tem.length;i++){
            
            if((tem[i]==1 && map.getOrDefault(nums[i], 0) == 1) || k==nums.length){
                max=Math.max(max,nums[i]);
            }
        
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}