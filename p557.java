class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String words[] = s.split(" ");
        for(String word:words)
            str.append(reverse(word) + " ");
        return str.toString().substring(0,s.length());
    }
    public String reverse(String word){
        char data[] = word.toCharArray();
        for(int i=0;i<data.length/2;i++){
            char temp = data[i];
            data[i] = data[data.length-i-1];
            data[data.length-i-1] = temp;
        }
        return new String(data);
    }
}