import java.util.Arrays;

/**
 * @author nawaz
 */
public class SortAnArrayOf0s1sAnd2s {

    // Sort an array of 0s, 1s and 2s
    //  ex :- Input : N = 5
    //        arr[]= {0 2 1 2 0}
    //        Output:0 0 1 2 2

    //        Input:N = 3
    //        arr[] = {0 1 0}
    //        Output:0 0 1


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{0 ,2 , 2, 0})));
        System.out.println(Arrays.toString(sort(new int[]{0, 1 ,0})));
        System.out.println(Arrays.toString(sort(new int[]{ 1 ,0})));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void sort012(int arr[], int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
                default:
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
