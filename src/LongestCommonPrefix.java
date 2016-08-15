/**
 * Created by lld on 16/8/2.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        } else if(strs.length == 1) {
            return strs[0];
        } else {
            int shortestLength = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < shortestLength)
                    shortestLength = strs[i].length();
            }
            String common = "";
            for(int i = 0; i <shortestLength; i++) {
                common = strs[0].substring(0, i+1);
                for (int j = 1; j < strs.length; j++) {
                    if (!strs[j].substring(0, i+1).equals(common)) {
                        if(i == 0) {
                            return "";
                        } else {
                            return strs[0].substring(0, i);
                        }
                    }
                }
            }
            return common;
        }
    }
}
