package GFG_POTD;

class Solution {
    private final int mod = 1000000007;

    private long f(int term, int start, int n) {
        if (term > n) {
            return 0;
        }
        long ans = 1;
        for (int i = 0; i < term; i++) {
            ans = ans * start;
            ans = ans % mod;
            start++;
        }
        ans = ans + f(term + 1, start, n);
        ans = ans % mod;
        return ans;
    }

    public long sequence(int n) {
        long ans = f(1, 1, n);
        return ans;
    }
}