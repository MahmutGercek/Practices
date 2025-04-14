import java.util.Arrays;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        int[] nums1={1,3};
        int[] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1,int[] nums2) {   //Purpose of the code = Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays!!!
        double median;
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m + n]; int l= arr.length; int k = 0;   //Declaring our variables;
        for(int i=0;i<m;i++){ arr[k]=nums1[i]; k++; }               //With for loops we merge our sorted arrays into one new array
        for(int i=0;i<n;i++){ arr[k]=nums2[i]; k++; }
        Arrays.sort(arr);                                           //We sort our new Array with .sort() method (which is from Java Arrays class.
        if(l%2==0){                                                 //We check here if remaining from dividing by 2 is 0 or not if it is 0 we get the sum of 2 numbers at middle and divide them
            double a=Double.valueOf(arr[(l-1)/2]);
            double b=Double.valueOf(arr[((l-1)/2)+1]);
            median = (a+b)/2;
        }
        else{ median=Double.valueOf(arr[((l-1)/2)]); }              //If it is not 0, we directly get the value of the character at the middle
        return median;
    }
}
