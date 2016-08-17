/**
 * Created by lld on 16/8/16.
 */
public class ClimbingStairs {
    // This method cannot be accepted, because of time limit.
    public static int climbStairs(int n) {
        if (n > 2) {
            return climbStairs(n-1) + climbStairs(n-2);
        } else if (n == 2) {
            return 2;
        } else {
            return 1;
        }
    }

    public static int climbStairsOtherVersion(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int result = 0;
        int last = 2;
        int lastlast =1;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            result = last + lastlast;
            temp = last;
            last = result;
            lastlast = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 0,b =2;
        System.out.println(a + " " + b);
        System.out.println(climbStairsOtherVersion(44));
    }
}
