import java.util.Arrays;

/**
 * @author nawaz
 */
public class MoveAllNegativeNumbersToBeginningAndPositiveToEnd {


    // Move all negative numbers to beginning and positive to end with constant extra space

    // ex :- Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
    //       Output: -12 -13 -5 -7 -3 -6 11 6 5


    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6})));
        System.out.println(Arrays.toString(sort(new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9})));
    }

    public static int[] sort(int[]arr){
        int[] n=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}
