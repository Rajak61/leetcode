class Solution {
    public int eraseOverlapIntervals(int[][] arr) {

        int sum=0;
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
        int n = arr.length;
        int i = 1;
        int[] L = arr[0];

        while (i < n) {
            int cur_start = arr[i][0];
            int cur_end = arr[i][1];

            int last_end = L[1];

            if (cur_start >= last_end) {// safe
                L = arr[i];
            } else if (cur_end >= last_end) {
                sum++;

            } else if (cur_end < last_end) {
                L = arr[i];
                sum++;

            }
            i++;

        }

        return sum;

    }
}