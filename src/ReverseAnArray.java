import java.util.Arrays;

/**
 * @author nawaz
 */
public class ReverseAnArray {

//    reverse an array
    // ex :- Input  : arr[] = {1, 2, 3}
    //       Output : arr[] = {3, 2, 1}
    //       Input :  arr[] = {4, 5, 1, 2}
    //       Output : arr[] = {2, 1, 5, 4}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse(new int[]{4, 5, 1, 2})));
        System.out.println(Arrays.toString(reverse(new int[]{3,6,8,3,54,23,54,45})));
    }

    public static int[] reverse(int[] arr) {
        int[] a=new int[arr.length];
        int c=0;
        for (int i=arr.length-1;i>=0;i--){
            a[c++]=arr[i];
        }
        return a;
    }
}
