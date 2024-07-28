class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;  // Initialize the index for unique elements
        
        // Iterate through each element in the array
        for (final int num: nums) {
            // Check if the current element is the first element or greater than the last unique element
            if (i < 1 || num > nums[i - 1]) {
                nums[i++] = num;  // Assign the unique element to the current position and increment the index
            }
        }
        
        return i;  // Return the count of unique elements
    }
}
