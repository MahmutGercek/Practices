import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner linecounter = new Scanner(System.in);
        System.out.println("Enter the number of lines you want: ");
        int lines = linecounter.nextInt();
        int starnumber = 2*lines-1;
        int spacenumber = 0;
        while(lines>=1){
            for(int j=0;j<spacenumber;j++){
                System.out.print(" ");
            }
            for(int i=0;i<starnumber;i++){
                System.out.print("*");
            }
            System.out.println();
            lines--;
            spacenumber++;
            starnumber-=2;

        }
    }
}
