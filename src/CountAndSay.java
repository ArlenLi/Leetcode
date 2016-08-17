/**
 * Created by lld on 16/8/15.
 */
public class CountAndSay {
    public static String countAndSay(int n) {
        String result = "1";
        String temp = result;
        int count = 1;
        for (int i = 1; i < n; i++) {
            temp = result;
            result = "";
            for (int j = 0; j < temp.length(); j++) {
                count = 1;
                while((j + 1) < temp.length() && temp.charAt(j + 1) == temp.charAt(j)) {
                    count++;
                    j++;
                }
                result = result + count + temp.charAt(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
