public class remove_duplicate_from_sorted_array 

{
    public int removeDuplicates(int[] nums) {

        // Edge case: If the array is empty, there are no unique elements.
        if (nums.length == 0) {
            return 0;
        }

        // i points to the last unique element.
        // j scans the array to find the next unique element.
        int i = 0;
        int j = 1;

        // Traverse the array using j.
        while (j < nums.length) {

            // If current element is different from the last unique element,
            // we have found a new unique element.
            if (nums[i] != nums[j]) {

                // Move i to the next available position for a unique element.
                i++;

                // Place the newly found unique element at position i.
                nums[i] = nums[j];
            }

            // Move j forward to check the next element.
            // This happens whether the current element is duplicate or unique.
            j++;
        }

        // i is an index, so add 1 to get the total number of unique elements.
        return i + 1;
    }


    
}
