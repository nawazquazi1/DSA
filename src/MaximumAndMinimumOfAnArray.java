import java.util.Arrays;

/**
 * @author nawaz
 */
public class MaximumAndMinimumOfAnArray {

    //Maximum and minimum of an array using minimum number of comparisons

    // ex : - Input: arr[] = {3, 5, 4, 1, 9}
    //        Output: Minimum element is: 1
    //        Maximum element is: 9

    //        Input: arr[] = {22, 14, 8, 17, 35, 3}
    //        Output:  Minimum element is: 3
    //        Maximum element is: 35


    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxMin(new int[]{3, 5, 4, 1, 9})));
        System.out.println(Arrays.toString(maxMin(new int[]{22, 14, 8, 17, 35, 3})));
        int Keyword=123;
    }

    public static int[] maxMin(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return new int[]{max,min};
    }
}
