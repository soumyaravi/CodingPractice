class Solution {
    public int[] nextGreaterElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = new int[nums.length];
        Stack<Integer> st = new Stack();
        Stack<Integer> st2 = new Stack();
        for(int i=0;i<nums.length;i++){
            while(!st.empty() && st.peek()<nums[i]){
                map.put(st2.pop(), nums[i]);
                st.pop();
            }
            st.push(nums[i]);
            st2.push(i);
        }
        st.clear();
        st2.clear();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(i)){
                st.push(nums[i]);
                st2.push(i);
            }
        }
        for(int i=0;i<nums.length;i++){
            while(!st.empty() && st.peek()<nums[i]){
                map.put(st2.pop(), nums[i]);
                st.pop();
            }
        }
        for(int i=0;i<nums.length;i++){
            res[i] = map.getOrDefault(i,-1);
        }
        return res;
    }

    public int[] nextGreaterElements2(int[] nums) {
        int res[] = new int[nums.length];
        Stack<Integer> st = new Stack();
        for(int i=2*nums.length-1;i>=0;i--){
            while(!st.empty() && nums[st.peek()] <= nums[i%nums.length])
                st.pop();
            res[i%nums.length] = st.empty()?-1:nums[st.peek()];
            st.push(i%nums.length);
            
        }
        return res;
    }
}