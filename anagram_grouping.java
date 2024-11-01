import java.util.*;
class anagram_grouping {
    String[] strs = {"bat","tab","tan","nat","bta","nta"};        
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key))
                ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
}

//Time Complexity: O(NKlogK), where N is the length of strs, and K is the maximum length of a string in strs. 
//The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(KlogK) time.
