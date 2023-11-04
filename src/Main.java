import java.util.Arrays;

public class Main {
    public static double find_median(int[] arr) {
        Arrays.sort(arr);

        if (arr.length % 2 == 1) {
            return arr[(arr.length + 1)/2 - 1];
        } else {
            return (double) (arr[arr.length/2 - 1] + arr[arr.length/2]) /2;
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        int i = 0;
        for (int k : nums1) merged[i++] = k;
        for (int k : nums2) merged[i++] = k;

        return find_median(merged);
    }

    public static void main(String[] args) {
        /*int[] nums1 = {1,3};
        int[] nums2 = {2};*/

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}