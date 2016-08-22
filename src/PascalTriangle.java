import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lld on 16/8/22.
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(Arrays.asList(1));
        if (numRows == 1) {
            return result;
        }

        List<Integer> last = new ArrayList<>();
        last = result.get(0);
        List<Integer> current;
        for (int i = 2; i <= numRows; i++) {
            current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j <= i - 2; j++) {
                current.add(last.get(j-1)+last.get(j));
            }
            current.add(1);
            result.add(current);
            last = current;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
