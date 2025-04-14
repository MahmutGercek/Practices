public class NumberCheckInArray {
    public static void main(String[] args) {
        int[] numbers = {2,3,4,5,6,7};
        int number = 5;
        boolean checker = false;
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]==number){
                checker=true;
                System.out.println("This number is in the list!");
            }
        }
        if(!checker){
            System.out.println("This number is not in the list!");
        }
    }
}
