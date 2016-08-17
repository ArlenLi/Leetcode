/**
 * Created by lld on 16/7/29.
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        String[][] table = {
                {"", "I","II","III","IV","V","VI","VII","VIII","IX"},
                {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"", "M","MM","MMM"}
        };
        String result = table[3][num/1000] + table[2][num%1000/100] + table[1][num%100/10] + table[0][num%10];
        return result;
    }
}
