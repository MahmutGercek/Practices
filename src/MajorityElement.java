import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {8,8,7,7,7};
        System.out.println(MajorityElement(nums));
    }
    public static int MajorityElement(int[] nums){
        HashMap<Integer,Integer> counter = new HashMap<>();
        int majoritynum=0;
        int n=nums.length;
        int majoritytime=n/2;
        for(int i=0;i<n;i++){
            if(counter.containsKey(nums[i])){
                counter.put(nums[i], counter.get(nums[i])+1);
            }
            else {
                counter.put(nums[i], 1);
            }
        }
        for(int i=0;i<n;i++){
            if(counter.get(nums[i])>majoritytime){
                majoritynum=nums[i];
            }
        }
        return majoritynum;
    }
}

