class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array to minimize the binary search range
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0, high = m;

        while (low <= high) {
            // Partition index for nums1
            int partition1 = (low + high) / 2;
            // Partition index for nums2 to split elements equally
            int partition2 = (m + n + 1) / 2 - partition1;

            // Handle edge boundary conditions using infinity
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if valid partition is found
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If combined length is odd
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } 
                // If combined length is even
                else {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                }
            } 
            // We took too many elements from nums1, shift search left
            else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
            } 
            // We took too few elements from nums1, shift search right
            else {
                low = partition1 + 1;
            }
        }

        return 0.0;
    }
}