class Solution {
    public int addDigits(int num) {
        boolean flag = false;
        int sum = num;
        while(!flag){
            sum = findSum(sum);
            flag = sum <= 9 ? true : false;
        }
        return sum;
    }
    int findSum(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
	public int addDigits(int num) {
	    if(num == 0)
		return 0;
	    else if(num % 9 == 0)
		return 9;
	    else
		return num % 9;
	}
}