import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {15,11,2,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target){
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

