class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> map = new HashSet<>();
        for(int num:candies){
            map.add(num);
        }
        int count = map.size();
        if(count<=candies.length/2)
            return count;
        else
            return candies.length/2;
    }
    

}