class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {

            char[] chArray = str.toCharArray();
            Arrays.sort(chArray);
            String s = new String(chArray);
           map.putIfAbsent(s, new ArrayList<>());
           map.get(s).add(str);
        }

        List<List<String>> result= new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
