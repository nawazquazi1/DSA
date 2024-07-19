import java.util.ArrayList;

public class Reverse_Pair {


    public static void main(String[] args) {
        System.out.println(reversePairs2(new int[]{12,32,34,54,5}));
    }

    public static int reversePairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > 2L * nums[j]) {
                    count++;
                }

            }
        }
        return count;
    }


    // better approach

        public static int reversePairs2(int[] arr) {
            return mergeSort(arr, 0, arr.length - 1);
        }

        static int merge(int[] arr, int low, int mid, int high) {
            int count = 0;
            int j = mid + 1;
            for (int i = low; i <= mid; i++) {
                while (j <= high && arr[i] > (2 * (long) arr[j])) {
                    j++;
                }
                count += (j - (mid + 1));
            }

            ArrayList<Integer> temp = new ArrayList<>();
            int left = low, right = mid + 1;
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left++]);
                } else {
                    temp.add(arr[right++]);
                }
            }

            while (left <= mid) {
                temp.add(arr[left++]);
            }

            while (right <= high) {
                temp.add(arr[right++]);
            }

            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }

            return count;
        }

       public static int mergeSort(int[] arr, int low, int high) {
            if (low >= high) return 0;
            int mid = (low + high) / 2;
            int inv = mergeSort(arr, low, mid);
            inv += mergeSort(arr, mid + 1, high);
            inv += merge(arr, low, mid, high);
            return inv;
        }
    }

