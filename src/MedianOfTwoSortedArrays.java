import java.util.Arrays;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1,int[] nums2) {
        double median;
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n]; int l= arr.length; int k = 0;
        for(int i=0;i<m;i++){ arr[k]=nums1[i]; k++; }
        for(int i=0;i<n;i++){ arr[k]=nums2[i]; k++; }
        Arrays.sort(arr);
        if(l%2==0){
            double a=Double.valueOf(arr[(l-1)/2]);
            double b=Double.valueOf(arr[((l-1)/2)+1]);
            median = (Double.valueOf(arr[(l-1)/2])+Double.valueOf(arr[((l-1)/2)+1]))/2;
        }
        else{ median=Double.valueOf(arr[((l-1)/2)]); }
        return median;
    }
}
