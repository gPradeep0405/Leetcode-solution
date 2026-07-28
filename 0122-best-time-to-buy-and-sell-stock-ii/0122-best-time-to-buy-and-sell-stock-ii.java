class Solution {
    public int maxProfit(int[] arr) {
        // int sum=0
        int n=arr.length;
        if(n<=1){
            System.out.println(0);
            return 0;
        }
        int l=0,sum=0;;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sum+=(arr[i]-arr[l]);
                l=i+1;
            }
        }
        if(arr[n-1]>arr[l]){
            sum+=(arr[n-1]-arr[l]);
        }
        return sum;
    }
}