/**
 * Created by lld on 16/8/16.
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < a.length() - b.length(); i++) {
            sb.append(0);
        }
        sb.append(b);
        b = sb.toString();
        StringBuilder result = new StringBuilder("");
        int carry = 0;
        for (int i = a.length() - 1; i >=0; i--) {
            result.append((Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(i)+"") + carry)%2);
            carry = (Integer.parseInt(a.charAt(i)+"") + Integer.parseInt(b.charAt(i)+"") + carry)/2;
        }
        if (carry == 1) {
            result.append(1);
        }
         return result.reverse().toString();
    }

    public static void main(String[] args) {
        String res = "aaa";
        res += "b";
        System.out.print(res);

    }
}
