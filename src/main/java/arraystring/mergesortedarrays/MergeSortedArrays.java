package arraystring.mergesortedarrays;

/*
#88
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

import java.util.Arrays;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[k++];
        }
        Arrays.sort(nums1);

        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[k++];
        }
        int temp = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length - 1; j++) {
                if (nums1[j] > nums1[j+1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }

        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }



}
