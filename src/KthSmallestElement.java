import java.util.Arrays;

/**
 * @author nawaz
 */

public class KthSmallestElement {

    // Kth smallest element

    //  ex :- Input: N = 6 , K = 3
    //        arr[] = 7 10 4 3 20 15
    //        Output : 7
    //        Input:N = 5 , K = 4
    //        arr[] = 7 10 4 20 15
    //        Output : 15


    public static void main(String[] args) {
        System.out.println(smallest(new int[]{7, 10, 4, 20, 15}, 4));
    }

    public static int smallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}