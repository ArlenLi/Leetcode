/**
 * Created by lld on 16/8/16.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int i = digits.length-1;
        int count = 0;
        while(i >= 0) {
            if (digits[i] + 1 == 10) {
                digits[i] = 0;
                count++;
                i--;
            } else {
                digits[i] += 1;
                break;
            }
        }
        if (count == digits.length) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int j = 1; j < result.length; j++) {
                result[j] = 0;
            }
            return result;
        }
        return digits;
    }

    public static int[] plusGeneral(int[] digits, int add) {
        int i = digits.length - 1;
        int carry = 0;
        int temp = 0;
        while(i >= 0) {
            if (i == digits.length - 1)
                temp = digits[i] + add + carry;
            else
                temp = digits[i] + carry;
            digits[i] = temp % 10;
            carry = temp / 10;
            if (carry == 0) {
                break;
            }
            i--;
        }

        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carry;
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] test = {9,9,9};
        test = plusGeneral(test, 1);
        for (int i : test) {
            System.out.print(i);
        }
    }
}
