import java.util.*;

class Q2 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        char[] ch = s1.toCharArray();;
        Arrays.sort(ch);

        for(int i=0; i <= s2.length() - s1.length(); i++){
            String subStr = s2.substring(i, i + s1.length());
            char[] subStrArr = subStr.toCharArray();
            Arrays.sort(subStrArr);

            if(Arrays.equals(ch, subStrArr)) return true;
        }
        return false;
    }
}