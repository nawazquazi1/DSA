import java.util.Arrays;

public class CyclicallyRotateAnArrayByOne {

    // Cyclically rotate an array by one

    // ex :- Input:N = 5
    //      A[] = {1, 2, 3, 4, 5}
    //      Output:5 1 2 3 4

    //      Input:N = 8
    //      A[] = {9, 8, 7, 6, 4, 2, 1, 3}
    //      Output:3 9 8 7 6 4 2


    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[] {9, 8, 7, 6, 4, 2, 1, 3},8)));
        System.out.println(Arrays.toString(rotate(new int[] {1, 2, 3, 4, 5},5)));
    }

    public static int[] rotate(int[] arr, int n) {
        int temp = arr[n - 1];
        System.arraycopy(arr, 0, arr, 1, n - 2 + 1);
        arr[0] = temp;

        return arr;
    }

}
