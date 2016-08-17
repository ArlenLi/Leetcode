/**
 * Created by lld on 16/7/29.
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int result;
        result = singleRomanToInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (singleRomanToInt(s.charAt(i - 1)) < singleRomanToInt(s.charAt(i))) {
                result+=(singleRomanToInt(s.charAt(i))) - (2 * singleRomanToInt(s.charAt(i - 1)));
            } else {
                result += (singleRomanToInt(s.charAt(i)));
            }
        }
        return result;
    }

    public int singleRomanToInt(char single) {
        switch(single) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = 3;
        int b = 2;
        int B = 3;
        switch(i) {
            case 'b':
                int a =0;
                System.out.println("yoyoyoy");
                break;
            case 'B':
                System.out.println("what is the fuck");
                break;
            default:
                System.out.println("hello");
                break;
        }
    }
}
