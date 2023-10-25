/**
 * @author nawaz
 */
public class KadaneAlgorithm {

    // Kadane's Algorithm

    //ex :- Input:N = 5
    //      Arr[] = {1,2,3,-2,5}
    //      Output:9

    //      Input:N = 4
    //      Arr[] = {-1,-2,-3,-4}
    //      Output:-1


    public static void main(String[] args) {
        System.out.println(maxSubArray(new long[]{1,2,3,-2,5}));
        System.out.println(maxSubArray(new long[]{-1,-2,-3,-4}));
    }

    public static long maxSubArray(long[] nums) {
        long maxSum = Integer.MIN_VALUE;
        long currentSum = 0;

        for (long num : nums) {
            currentSum = Math.max(num, currentSum + num);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }



}
