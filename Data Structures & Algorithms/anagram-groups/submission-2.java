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
            res.putIfAbsent(key, new ArrayList<>());//O(1)
            res.get(key).add(s);//O(1)
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


//note : 
//When using character frequency arrays as keys, you must convert 
//them to an immutable type (like a tuple in Python or a string in 
//other languages). Lists and arrays are mutable and cannot be used 
//as dictionary keys directly.
