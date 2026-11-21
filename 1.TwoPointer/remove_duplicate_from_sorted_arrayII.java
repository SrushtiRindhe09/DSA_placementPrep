public class remove_duplicate_from_sorted_arrayII 
{
  
class Solution {
    public int removeDuplicates(int[] nums) {

        /*
         * STEP 1: Handle the edge case.
         * If the array contains 0, 1, or 2 elements,
         * all elements are already valid because each
         * element is allowed to appear at most twice.
         */
        if (nums.length <= 2) {
            return nums.length;
        }

        /*
         * STEP 2: Initialize the placement pointer.
         * i = 2 because the first two elements can
         * always be included in the modified array.
         *
         * i represents the position where the next
         * valid element should be placed.
         */
        int i = 2;

        /*
         * STEP 3: Traverse the array using pointer j.
         * Start j from index 2 because the first two
         * elements are already considered valid.
         *
         * j scans every remaining element to find
         * the next valid element.
         */
        for (int j = 2; j < nums.length; j++) {

            /*
             * STEP 4: Check whether the current element
             * can be included in the modified array.
             *
             * Compare nums[j] with nums[i - 2].
             *
             * If they are different, including nums[j]
             * will not make the current element appear
             * more than twice in the valid portion.
             *
             * If they are equal, it would create a third
             * occurrence, so we skip that element.
             */
            if (nums[j] != nums[i - 2]) {

                /*
                 * STEP 5: Place the valid element at
                 * position i.
                 *
                 * Increment i because the next valid
                 * element must be placed at the next index.
                 */
                nums[i] = nums[j];
                i++;
            }

            /*
             * STEP 6: The for loop automatically increments j.
             * We do not need to manually increment j here.
             */
        }

        /*
         * STEP 7: Return i.
         *
         * Since i represents the next available position,
         * it also represents the total number of valid elements.
         */
        return i;
    }
}
    
}
