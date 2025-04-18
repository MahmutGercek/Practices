public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(Palindromeornot(1111));
    }
    public static boolean Palindromeornot(int x){
        String check = Integer.toString(x);        //We assign the string value of our integer input.
        int right=0; int left=check.length()-1;    //We assign our indicators
        int al=check.length();                     //Assigning the length of string for easier writing
        int carry=0;                               //Assigning a carry value for checking if our x integer is palindrome or not by updating our carry value in while loop


        while(right<=(al/2)-1&&left>=(al/2)&&check.charAt(right)==check.charAt(left)){      //While our indicators aren't in the middle of our integer and the characters being same we update the indicators and carry
                right++; left--; carry++;
            }
        if(al%2==0&&carry==al/2){                  //in here we return true or false depends on conditions.
            return true;
        }
        else if(al%2!=0&&carry==al/2){
            return true;
        }
        else{
            return false;
        }
    }
}
