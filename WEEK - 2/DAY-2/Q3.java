import java.util.*;

class Q3 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if(n < m) return list;

        char[] p1 = p.toCharArray();
        Arrays.sort(p1);

        for(int i=0;i<=n-m;i++){
            String s1= s.substring(i, i+m);
            char[] window = s1.toCharArray();
            Arrays.sort(window);

            if(Arrays.equals(p1, window)){
                list.add(i);
            }
        }
        return list;
    }
}