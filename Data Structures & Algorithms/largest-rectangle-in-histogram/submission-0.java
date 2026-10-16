class Solution {
    public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int[] after = new int[height.length];
        int[] before = new int[height.length];
        int max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            after[i] = stack.isEmpty() ? height.length : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[stack.peek()] >= height[i]) {
                stack.pop();
            }
            before[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        for (int i = 0; i < height.length; i++) {
            int width = after[i] - before[i] - 1;
            max = Math.max(max, height[i] * width);
        }

        return max;
    }
}