class Solution {
    public String[] uncommonFromSentences1(String A, String B) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> rem = new HashSet<>();
        
        for(String word:A.split(" ")){
            if(!set.contains(word))
                set.add(word);
            else
                rem.add(word);
        }
        for(String word:B.split(" ")){
            if(!set.contains(word) && ! rem.contains(word))
                set.add(word);
            else
                rem.add(word);
        }
        Iterator itr = rem.iterator();
        while(itr.hasNext()){
            set.remove(itr.next());
        }
        return set.toArray(new String[0]);
    }
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String,Integer> count = new HashMap<>();
        
        for(String word:A.split(" ")){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        for(String word:B.split(" ")){
            count.put(word,count.getOrDefault(word,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String word:count.keySet()){
            if(count.get(word) == 1)
                list.add(word);
        }
        return list.toArray(new String[list.size()]); 
    }
    

}