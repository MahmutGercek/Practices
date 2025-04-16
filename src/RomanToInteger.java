
public class RomanToInteger {
    public static void main(String[] args){
        System.out.println(RomanToInteger(""));
    }
    public static int RomanToInteger(String s) {    //Purpose of our code = Given a roman numeral, convert it to an integer.
        int num = 0; int after = 0;                 //Declaring variables,we will use "num" for calculating our number and "after" for comparing indexes
        for (int i = s.length()-1; i>=0; i--) {     //We start from last index go to start index,and assign the current index to before
            char c = s.charAt(i);
            int before=0;
                switch (c) {                        //In this switch case, we check our "character" and assign the value for it
                    case 'I':
                        before= 1;
                        break;
                    case 'V':
                        before=5;
                        break;
                    case 'X':
                        before= 10;
                        break;
                    case 'L':
                        before= 50;
                        break;
                    case 'C':
                        before= 100;
                        break;
                    case 'D':
                        before= 500;
                        break;
                    case 'M':
                        before= 1000;
                        break;
                }
                if(before<after){               //If our current index smaller than next one that means we need to substract that from our number because it means that is  "IV,IX,..."
                    num-=before;
                }
                else{                           //If it is not we add the value to number;
                    num+=before;
                }
                after=before;                   //and assign the "after" value to "before" for next comparing
            }
        return num;                             //returning number
        }
    }

