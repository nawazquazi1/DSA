import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author nawaz
 */
public class MergeIntervals {

    // Merge Intervals

    // ex :- Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    //       Output: [[1,6],[8,10],[15,18]]
    //Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

    //       Input: intervals = [[1,4],[4,5]]
    //       Output: [[1,5]]
    //Explanation: Intervals [1,4] and [4,5] are considered overlapping.

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    public static int[][] merge(int[][] time) {
        Arrays.sort(time, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval : time) {
            if (list.isEmpty()) {
                list.add(interval);
            } else {
                int[] pervi = list.get(list.size() - 1);
                if (interval[0] <= pervi[1]) {
                    pervi[1] = Math.max(pervi[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size() - 1][]);
    }

}
