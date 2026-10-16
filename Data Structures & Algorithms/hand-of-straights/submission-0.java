class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

        while (map.size() != 0) {
            int idx = 0;
            int val = map.firstKey();
            while (idx < groupSize) {
                int x = val + idx;
                if (!map.containsKey(x)) {
                    return false;
                }
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0)
                    map.remove(x);
                idx++;
            }
        }
        return true;

    }
}