import java.util.ArrayList;
class LongestSubstring {
    public static void main(String[] args){
        System.out.println(longestsubstringfinder("abcaaa"));
    }
    public static int longestsubstringfinder(String s) {
        int l = s.length();
        int maxlength= 0;
        boolean repeating=false;
        ArrayList<Character> counter= new ArrayList<>();
        if(s.length()==1){
            return 1;
        }
        for (int i = 0; i < l; i++) {
            counter.add(s.charAt(i));
            if(counter.size()>1) {
                for (int j = 0; j < counter.size()-1; j++) {
                    if (counter.getLast() == counter.get(j)) {
                        if(counter.size()>maxlength){
                            maxlength=counter.size()-1;
                        }
                        while (j >= 0) {
                            counter.remove(j);
                            j--;
                        }
                    }
                }
            }
        }
        if(counter.size()>maxlength){
            maxlength=counter.size();
        }
        return maxlength;
    }
}