
import java.util.*;
public class test_ana {
    public static List<List<String>> groupAnagrams(String[] arr) {
        // Use a HashMap to store groups of anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : arr) {
            // Convert word to char array, sort it and convert back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            // If sorted word is not in the map, add it
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            
            // Add the original word to the list of anagrams
            anagramMap.get(sortedWord).add(word);
        }
        
        // Return the values (list of lists) from the map
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] arr = {"bat", "tab", "tan", "nat", "bta", "nta"};
        List<List<String>> result = groupAnagrams(arr);
        
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

