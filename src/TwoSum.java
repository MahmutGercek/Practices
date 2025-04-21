import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,3};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int completer = target-nums[i];
            if(check.containsKey(completer)){
                return new int[]{check.get(completer),i};
            }
            check.put(nums[i],i);
        }
        return new int[]{};
    }
}

