class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int num=target;
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                res[1] = i;
                num = target-nums[i];
                break;
            }
            else
                set.add(target-nums[i]);
        }
        System.out.println(num);
        for(int i=0;i<res[1];i++){
            if(nums[i] == num){
                res[0] = i;
                break;
            }
        }
        return res;
    }
}