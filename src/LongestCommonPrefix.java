public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strings = {"a"};
        System.out.println(LongestCommonPrefix(strings));
    }
    public static String LongestCommonPrefix(String[] strs){                //Purpose of our code=Write a function to find the longest common prefix string amongst an array of strings.
        String lpref = "";              //Assigning an default lpref
        int smallest=strs[0].length();
        String check="";
        for(int i=0;i< strs.length;i++){
            if(strs[i].length()<=smallest){
                smallest=strs[i].length();
                check=strs[i];
            }
        }
        int pass=check.length();
        for(int j=0;j<pass;j++) {
            int carry=0;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].startsWith(check)) {
                    carry++;
                }
            }

            if (carry == strs.length) {
                return check;
            }
            else {
                check = check.substring(0, check.length() - 1);
            }
        }
        return lpref;
    }
}
