import java.util.HashSet;

/**
 * @author nawaz
 */
public class FindDuplicate {

    // Find the Duplicate Number

    // ex :- Input: nums = [1,3,4,2,2]
    //       Output: 2

    //       Input: nums = [3,1,3,4,2]
    //       Output: 3


    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2, 2}));
    }

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return nums.length;
    }

}
