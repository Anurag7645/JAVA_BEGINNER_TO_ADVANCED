package GFG_POTD;

class Solution {
    public boolean allSame(List<Integer> freq) {
        int curr = -1;
        for (int it : freq) {
            if (it == 0)
                continue;
            else if (curr == -1)
                curr = it;
            else if (curr != it)
                return false;
        }
        return true;
    }

    public boolean sameFreq(String s) {

        int n = s.length();
        List<Integer> freq = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            freq.add(0);
        }
        for (int i = 0; i < s.length(); i++) {
            freq.set(s.charAt(i) - 'a', freq.get(s.charAt(i) - 'a') + 1);
        }
        if (allSame(freq)) {
            return true;
        }
        for (int i = 0; i < freq.size(); i++) {
            if (freq.get(i) != 0) {
                freq.set(i, freq.get(i) - 1);
                if (allSame(freq)) {
                    return true;
                }
                freq.set(i, freq.get(i) + 1);
            }
        }
        return false;
    }
}
