import java.util.ArrayList;
import java.util.List;

public class SummmaryRanges {
    public static void main(String[] args){
        int[] nums={1,2,3,4,6,8,9,10};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums){
        List<String> result = new ArrayList<>();
        int start=nums[0];
        if(nums.length==0)return new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(i== nums.length|| nums[i]!=nums[i-1]+1){
                if(start==nums[i-1]){
                    result.add(String.valueOf(start));
                }
                else{
                    result.add(start+"->"+nums[i-1]);
                }
                if(i<nums.length) start =nums[i];
            }
        }

        return result;
    }
}
