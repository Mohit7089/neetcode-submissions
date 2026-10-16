class Solution {
    public String reorganizeString(String s) {
        int[][] arr = new int[26][2];
        StringBuilder sb = new StringBuilder();

        // initialize
        for (int i = 0; i < 26; i++) {
            arr[i][0] = i + 'a';
            arr[i][1] = 0;
        }

        // count frequency
        for (char ch : s.toCharArray()) {
            arr[ch - 'a'][1]++;
        }

        // early impossible check
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, arr[i][1]);
        }
        if (max > (s.length() + 1) / 2) return "";

        // build result
        while (sb.length() < s.length()) {
            int pick = -1;

            // pick best valid character
            for (int i = 0; i < 26; i++) {
                if (arr[i][1] == 0) continue;

                char ch = (char) arr[i][0];

                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch)
                    continue;

                if (pick == -1 || arr[i][1] > arr[pick][1]) {
                    pick = i;
                }
            }

            // no valid pick
            if (pick == -1) return "";

            sb.append((char) arr[pick][0]);
            arr[pick][1]--;
        }

        return sb.toString();
    }
}
