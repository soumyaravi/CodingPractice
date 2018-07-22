class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashSet<Integer> set = new HashSet<>();
        int num=target;
        int res[] = new int[2];
        for(int i=0;i<numbers.length;i++){
            if(set.contains(numbers[i])){
                res[1] = i+1;
                num = target-numbers[i];
                break;
            }
            else
                set.add(target-numbers[i]);
        }
        for(int i=0;i<res[1]-1;i++){
            if(numbers[i] == num){
                res[0] = i+1;
                break;
            }
        }
        return res;
    }
    public int[] twoSum2(int[] numbers, int target) {
        int i=0, j= numbers.length -1;
        while(i<j){
            if(numbers[i] + numbers[j] > target)
                j--;
            else if(numbers[i] + numbers[j] < target)
                i++;
            else
                return new int[] {i+1,j+1};
        }
        return new int[2];
    }
}