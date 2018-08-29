class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = left;i<=right;i++){
            if(checkNumber(i))
                res.add(i);
        }
        return res;
        
    }
    boolean checkNumber(int num){
        int val = num;
        while(val>0){
            int d = val%10;
            if(d == 0)
                return false;
            if(num%d == 0)
                val/=10;
            else
                return false;
        }
        return true;
    }
}