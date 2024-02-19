package GFG_POTD;
import java.util.HashMap;
import java.util.PriorityQueue;
public class Game_with_String {
    public int minValue(String s, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int freq : mp.values()) {
            if (freq != 0) {
                pq.add(freq);
            }
        }
        for (int i = 0; i < k; i++) {
            int a = pq.poll();
            a--;
            if (a > 0) {
                pq.add(a);
            }
        }
        int ans = 0;
        while (!pq.isEmpty()) {
            int top = pq.poll();
            ans += top * top;
        }
        return ans;
    }
}
}
