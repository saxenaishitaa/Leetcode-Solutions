class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
         }
         int res=nums[0];
         int currMax=1;
         int currMin=1;
         for(int n:nums){
            if(n==0)
            {
                currMax=1;
                currMin=1;
                res=Math.max(res,0);
                continue;

            }
            
            int temp=currMax*n;
            currMax=Math.max(n,Math.max(temp,currMin*n));
            currMin=Math.min(n,Math.min(temp,currMin*n));
            res=Math.max(currMax,res);


         }
         return res;

        


        
    }
}