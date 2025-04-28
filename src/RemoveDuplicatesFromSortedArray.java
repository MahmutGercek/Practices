public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(RemoveDuplicates(nums));
    }
    public static int RemoveDuplicates(int[] nums){
        int l= nums.length;
        if(l==0) return 0;
        int dupe=nums[0]; int k=1;
        for(int i=1;i<l;i++){
            if(nums[i]==dupe) continue;
            else{
                nums[k]=nums[i];
                dupe=nums[i];
                k++;
            }
        }
        return k;
    }
}
