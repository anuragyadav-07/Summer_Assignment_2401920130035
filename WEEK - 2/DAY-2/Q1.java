import java.util.*;

class Q1 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int longest = 0, newStr = 0;
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                newStr = Math.max(map.get(s.charAt(i))+1, newStr);
            }
            map.put(s.charAt(i), i);
            longest = Math.max(longest, i-newStr+1);
        }
        return longest;
    }
}