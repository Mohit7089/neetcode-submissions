class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> a[1] - b[1]);
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int sum = 0;
        for (int i = 0; i < trips.length; i++) {
            q.add(new int[] { trips[i][0], trips[i][2] });
        }
        for (int i = 0; i < trips.length; i++) {
            int[] top = q.peek();
            sum += trips[i][0];
            while (trips[i][1] >= top[1] && !q.isEmpty()) {
                sum -= top[0];
                q.poll();
                top = q.peek();

            }
            if (sum > capacity)
                return false;

        }
        return true;
    }
}