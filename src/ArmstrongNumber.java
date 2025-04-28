import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner armstrongverifier = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = armstrongverifier.nextInt();
        int tempnumber = number;
        int digit = 0;
        int sum = 0;
        int numbermultiplier =1;
        while (tempnumber != 0) {
            digit++;
            tempnumber/=10;
        }
        tempnumber = number;
        for(int i=0;i<digit;i++){
            int tempnumber2 = number%10;
            numbermultiplier=1;
            for(int j=0;j<digit;j++){
                numbermultiplier*=tempnumber2;
            }
            sum += numbermultiplier;
            number/=10;
        }
        System.out.println("Sum is: " + sum);
        if(sum==tempnumber){
            System.out.println("This number is an armstrong number");
        }
        else{
            System.out.println("This number is not an armstrong number");
        }
    }
}