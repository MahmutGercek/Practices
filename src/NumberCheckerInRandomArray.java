import java.util.Random;
import java.util.Scanner;
public class NumberCheckerInRandomArray{
    public static void main(String[] args) {
        Random numberthrower = new Random();
        Scanner checker = new Scanner(System.in);
        int[] numbers = new int[20];
        for(int i=0;i<20;i++){
            numbers[i]=numberthrower.nextInt(0,101);
        }
        for(int k=0;k<20;k++){
            System.out.print(numbers[k]+" ");
        }
        System.out.println();
        boolean router = false;
        System.out.println("The number that you are looking for? ");
        int searchednumber = checker.nextInt();
        for(int j=0;j<numbers.length;j++){
            if(numbers[j]==searchednumber){
                router=true;
                System.out.println("The number that you are looking for is in the list!");
                System.out.println("The index of number is "+j);
            }
        }
        if(!router){
            System.out.println("The number that you are looking for is not in the list!");
        }
    }
}