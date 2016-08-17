/**
 * Created by lld on 16/8/15.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                i--;
                while(i>=0&& s.charAt(i) != ' ') {
                    count++;
                    i--;
                }
                break;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
