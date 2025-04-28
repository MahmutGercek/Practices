import java.util.HashMap;
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums,int k){
        HashMap<Integer,Integer> count =  new HashMap();
        for(int i=0;i<nums.length;i++){
            if(count.containsKey(nums[i])&&Math.abs(i-count.get(nums[i]))<=k){
                return true;
            }
            count.put(nums[i],i);
        }
        return false;
    }
}
