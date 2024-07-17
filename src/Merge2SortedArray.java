public class Merge2SortedArray {


    public static void main(String[] args) {

    }


//    Input:
//    nums2 = [2,5,2,3,5,6], m = 3,
//    nums1 = [1,2,3], n = 3
////    Output: [1,2,2,3,5,6]
//
//
//    s

    //    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = nums1.length - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }

        while (n >= 0) {
            nums1[i] = nums2[n];
            n--;
            i--;
        }


    }


    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1,p1=m-1,p2=n-1;
        while ( p2 >= 0) {
            if (p1>=0  && nums1[p1] > nums2[p2]) {
                nums1[last--] = nums1[p1--];
            } else {
                nums1[last--] = nums2[p2--];
            }

        }
    }


}

