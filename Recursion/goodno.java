class Solution {
    static final long mod = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long ceven = (n + 1) / 2;
        long codd  = n / 2;

        long oddways  = power(4L, codd);
        long evenways = power(5L, ceven);

        return (int)((oddways * evenways) % mod);
    }

    private long power(long base, long exp) {
        long res = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
}
