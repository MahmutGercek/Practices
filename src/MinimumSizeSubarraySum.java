import java.util.ArrayList;
class MinimumSizeSubarraySum {
    public static void main(String[] args){
        int[] nums={2,3,1,2,4,3};
        System.out.println(minimumsubarray(nums,7));
    }
    public static int minimumsubarray(int[] nums,int target){
        int left=0;
        int right=0;
        int sum=0;
        int lengthofmin=nums.length+1;
        if(nums.length==0) return 0;
        while(right<nums.length){
            sum+=nums[right];
            right++;
            while(sum>=target){
                lengthofmin = Math.min(lengthofmin,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(lengthofmin> nums.length){
            return 0;
        }
        ArrayList<String> metin = new ArrayList<>();
        return lengthofmin;
    }
}
