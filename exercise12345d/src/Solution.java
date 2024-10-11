public class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        for (int num : nums) {
            int remainder = num % 3;
            if (remainder != 0) {
                operations += Math.min(remainder, 3 - remainder);
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        System.out.println("Minimum operations: " + solution.minimumOperations(nums)); // Output: 3
    }
}
