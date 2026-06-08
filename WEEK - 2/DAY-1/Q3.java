import java.util.HashMap;

class Q3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }

        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        
        char[] arr1 = ransomNote.toCharArray();
        for(char ch : arr1){
            ransomMap.put(ch, ransomMap.getOrDefault(ch, 0) + 1);
        }

        char[] arr2 = magazine.toCharArray();
        for(char ch : arr2){
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch : ransomMap.keySet()){
            if(ransomMap.get(ch) > magazineMap.getOrDefault(ch, 0)){
                return false;
            }
        }

        return true;
    }
}