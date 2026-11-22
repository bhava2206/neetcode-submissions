class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sort = new String(ch);
            h.putIfAbsent(sort,new ArrayList<String>());
            h.get(sort).add(str);
        }
        return new ArrayList<>(h.values());
    }
}
