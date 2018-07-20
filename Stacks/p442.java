class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num: nums){
            if(set.contains(num))
                res.add(num);
            set.add(num);
        }
        return res;
    }
    public List<Integer> findDuplicates2(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0)
                res.add(Math.abs(nums[i]));
            else
                nums[index] *= -1;
        }
        return res;
    }

}