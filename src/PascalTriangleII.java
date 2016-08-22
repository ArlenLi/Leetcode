import java.util.ArrayList;
import java.util.List;

/**
 * Created by lld on 16/8/22.
 */
public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();

        res.add(1);
        if (rowIndex == 0) {
            return res;
        }
        for (int i = 1; i <=rowIndex; i++) {
            for (int j = i - 1; j > 0; j--){
                res.set(j, res.get(j)+res.get(j-1));
            }
            res.add(1);
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(getRow(21));
    }

}
