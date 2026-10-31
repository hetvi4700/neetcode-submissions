class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res= new HashMap<>();
        for(String s: strs)
        {
            int[] count= new int[26];
            for(char c: s.toCharArray())//converts string to char
            {
                count[c-'a']++;
            }
            String key=Arrays.toString(count);//converts array to srting
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

//Map<String, List<String>> res= new HashMap<>;
//s.toCharArray()
//res.putIfAbsent(key, new ArrayList<>());
//This creates a new empty ArrayList for that key if the key is
//not present in it.
//res.get(key).add(s); It adds string s at key position.
