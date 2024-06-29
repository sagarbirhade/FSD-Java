package Arrays;

public class SubArrayPositives {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int left = 0;
        int right = 0;
        long sum = a[0];
        int maxLen = 0;
        int n = a.length;
        while (right < n) {
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
                if (right < n) {
                    sum += a[right];
                }
            } else if (sum < k) {
                right++;
                if (right < n) {
                    sum += a[right];
                }
            } else {
                sum -= a[left];
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {1, -1, 5, -2, 3};
        long k = 3;
        int result = longestSubarrayWithSumK(a, k);
        System.out.println("Length of the longest subarray with sum " + k + ": " + result);;;
    }
}

