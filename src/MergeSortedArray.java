/**
 * Created by lld on 16/8/17.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        System.arraycopy(nums1, 0, temp, 0, m);
        int i = 0;
        int j = 0;
        int index = 0;
        while( i < m && j < n) {
            if (temp[i] <= nums2[j]) {
                nums1[index] = temp[i];
                i++;
                index++;
            } else {
                nums1[index] = nums2[j];
                j++;
                index++;
            }
        }
        if (i < m) {
            System.arraycopy(temp, i, nums1, index, m - i);
        } else {
            System.arraycopy(nums2, j, nums1, index, n - j);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,4,5};
        merge(nums1, 3, nums2, 3);
        for (int i: nums1) {
            System.out.println(i);
        }
    }
}
