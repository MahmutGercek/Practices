import java.util.HashMap;
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counter = new HashMap<>();
        if (ransomNote.equals(magazine)) {
            return true;
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (counter.containsKey(magazine.charAt(i))) {
                counter.replace(magazine.charAt(i), counter.get(magazine.charAt(i)) + 1);
            } else {
                counter.put(magazine.charAt(i), 1);
            }
        }
        int count=0;
        for (int i = 0; i < ransomNote.length(); i++) {
            char check = ransomNote.charAt(i);
            if (counter.containsKey(check)) {
                counter.put(check, counter.get(check) - 1);
                count++;
                if (counter.get(check) < 0) {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        if(count==ransomNote.length()){
            return true;
        }
        return false;
    }
}
