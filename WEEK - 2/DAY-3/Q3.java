class Q3 {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        String newstr = str.substring(1, str.length() - 1);
        return newstr.contains(s);
    }
}