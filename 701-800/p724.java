class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0)
            return -1;
        int sum[][] = new int[2][nums.length];
        int index = -1;
        sum[0][0] = 0;
        sum[1][nums.length-1] = 0;
        for(int i=1; i<nums.length;i++){
            sum[0][i] = sum[0][i-1] + nums[i-1];
            // System.out.println(sum[0][i] +" " + i);
        }
        if(sum[0][nums.length-1] == sum[1][nums.length-1])
            index = nums.length-1;
        
        for(int i=nums.length-2;i>=0;i--){
            sum[1][i] = sum[1][i+1] + nums[i+1];
            // System.out.println(sum[0][i] +" " + sum[1][i]);
            if(sum[0][i] == sum[1][i])
                index = i;
        }
        
        return index;
    }
    public int pivotIndex2(int[] nums) {
        if(nums.length == 0)
            return -1;
        int sum=0, left=0;
        for(int num:nums)
            sum+=num;
        for(int i=0;i<nums.length;i++){
            if(left == sum-left-nums[i])
                return i;
            left+=nums[i];
        }
        return -1;
    }
}