/**
 * Created by lld on 16/8/7.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i = 0;
        int index = 0;
        while(i < length) {
            while(i < length && i + 1 < length && (nums[i] == nums[i+1])) {
                i++;
            }
            nums[index] = nums[i];
            i++;
            index++;
        }
        return index;
    }

}
