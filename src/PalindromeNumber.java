/**
 * Created by lld on 16/7/29.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int newNum = 0;
        while (num != 0) {
            if (newNum > (Integer.MAX_VALUE - num % 10) / 10) {
                return false;
            }
            newNum = newNum * 10 + num % 10;
            num = num / 10;
        }
        return newNum == x ? true : false;
    }

    // test if the first digit is equal to the last digit, if not, return false
    public boolean isPalindromeOtherMethod(int x) {
        if(x < 0) {
            return false;
        }
        int div = 1;
        int num = x;

        while(num > 10) {
            num /= div;
            div *= 10;
        }

        num = x;

        while(num > 0){
            if(num /div != num%10)
                return false;
            num = num%div/10;
            div /= 100;
        }
        return false;


    }

    public static void main(String args[]) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(131));
    }
}
