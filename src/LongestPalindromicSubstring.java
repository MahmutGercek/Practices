public class LongestPalindromicSubstring {
    public static void main(String[] args){
        System.out.println(LongestPalindromic(""));
    }
    public static String LongestPalindromic(String s){
        String lp=""; int len=s.length(); int lps=lp.length();
        boolean pass=false;
        for(int l=0;l<len;l++){
            for(int r=l+1;r<len;r++){
                if(s.charAt(l)==s.charAt(r)){
                    String subst= s.substring(l,r+1);
                    char[] check;
                    check = subst.toCharArray();
                    String controlst=String.valueOf(check);
                        if(controlst.equals(subst)){
                            lps = Math.max(lps, r - l + 1);
                            if (lp.length() < lps) {
                                lp = subst;
                                pass=true;
                        }
                        }
                    }
                }
            }
        if(!pass){
            return String.valueOf(s.charAt(0));
        }
        return lp;
    }
}
