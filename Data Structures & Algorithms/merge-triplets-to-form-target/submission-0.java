class Solution {
    public boolean mergeTriplets(int[][] arr, int[] target) {
        int flag1 = 0;
        int flag2 = 0;
        int flag3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == target[0]) {
                if (arr[i][1] <= target[1] && arr[i][2] <= target[2]) {
                    flag1 = 1;
                }
            }
            if (arr[i][1] == target[1]) {
                if (arr[i][0] <= target[0] && arr[i][2] <= target[2]) {
                    flag2 = 1;
                }
            }
            if (arr[i][2] == target[2]) {
                if (arr[i][0] <= target[0] && arr[i][1] <= target[1]) {
                    flag3 = 1;
                }
            }
        }

        if (flag1 == 1 && flag2 == 1 && flag3 == 1)
            return true;
        return false;
    }
}