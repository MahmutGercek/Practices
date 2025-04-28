import java.util.ArrayList;
class LongestSubstring {
    public static void main(String[] args){
        System.out.println(longest_substring("Turkey"));
    }
    public static int longest_substring(String s) {    //Purpose of the code = Given a string s, find the length of the longest substring without duplicate characters!!!
        int l = s.length();
        int maxlength= 0;
        ArrayList<Character> counter= new ArrayList<>();
        if(s.length()==1){                                          //Returning 1 in case our string is only 1 length.
            return 1;
        }
        for (int i = 0; i < l; i++) {                               //Looping in every character in our string,
            counter.add(s.charAt(i));                               //And adding them one by one to our ArrayList.
            if(counter.size()>1) {                                  //We need at least two characters to check because we are already returning 1.
                for (int j = 0; j < counter.size()-1; j++) {        //We used "counter.size()-1" because last added character doesn't need to check itself
                    if (counter.getLast() == counter.get(j)) {      //At line 17,18 an 19, if last added character equals to one of the characters in our array,it updates our maxlength variable.
                        if(counter.size()>maxlength){
                            maxlength=counter.size()-1;
                        }
                        while (j >= 0) {                            //After updating our "maxlength" we delete the repeating characters at the start and behind them,this helps us to work on our String as windows!
                            counter.remove(j);
                            j--;
                        }
                    }
                }
            }
        }
        if(counter.size()>maxlength){                               //At this "if decision" part we do a last check
            maxlength=counter.size();                               //because if there is any repeating characters at the end of the array such as
        }                                                           //"abcaa","abcdaa" or "bcdgfkmmmmnn" because at those cases our algorithm removes the repeating character after updating the "maxlength"
        return maxlength;                                           //with this last check we prevent this from happening!
    }
}