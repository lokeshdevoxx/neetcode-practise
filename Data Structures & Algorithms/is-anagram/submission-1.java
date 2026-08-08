class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
    
        for(char c: s.toCharArray()) {
            if(sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c)+1);
            } else {
                sMap.put(c, 1);
            }
        }

        System.out.println(sMap);

        boolean flag=true;
        
        for(char ch: t.toCharArray()) {
            int val = sMap.getOrDefault(ch, -1);
            sMap.put(ch, --val);
        }

        for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if(entry.getValue()!=0) {
                flag=false;
                break;
            }
        }

        return flag;

    }
}
