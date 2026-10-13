class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String word=new String(c);
            map.computeIfAbsent(word, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
