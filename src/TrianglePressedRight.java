import java.util.Scanner;
public class TrianglePressedRight {
    public static void main(String[] args) {
        Scanner linecounter = new Scanner(System.in);
        System.out.println("Enter the number of lines you want: ");
        int satir = linecounter.nextInt();
        int ysayi =1;
        for(int i = satir; i >0; i--) {
            for(int j = i-1; j >0; j--) {
                System.out.print(" ");
            }
            for(int k =0; k <ysayi; k++) {
                System.out.print("*");
            }
            ysayi++;
            System.out.println();
        }
    }
}
