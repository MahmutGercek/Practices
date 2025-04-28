import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner linecounter = new Scanner(System.in);
        System.out.println("Enter the lines for the triangle you want");
        int lines= linecounter.nextInt();
        int starnumber=1;
        int spacenumber=lines-1;
        int templines=1;
        while(templines<=lines) {
            for (int j = 0; j < spacenumber; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i < starnumber; i++) {
                System.out.print("*");
            }
            System.out.println();
            starnumber+=2;
            spacenumber--;
            templines++;
        }
    }
}