class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int maxfreq = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
            maxfreq = Math.max(maxfreq, freq.get(ch));
            if ((r - l + 1) - maxfreq > k) {
                char ch1 = s.charAt(l);
                freq.put(ch1, freq.get(ch1) - 1);
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        System.gc();
        return maxlen;
    }
}