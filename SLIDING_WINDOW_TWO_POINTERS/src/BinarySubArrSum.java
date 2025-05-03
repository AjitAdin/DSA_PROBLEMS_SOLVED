
class BinarySubArrSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    count++;
                }
            }
        }
        return count;
    }



    public static void main(String[] args) {
        BinarySubArrSum solution = new BinarySubArrSum();

        int[] nums1 = {1, 0, 1, 0, 1};
        int goal1 = 2;
        System.out.println("Output 1: " + solution.numSubarraysWithSum(nums1, goal1));  // Expected: 4

        int[] nums2 = {0, 0, 0, 0, 0};
        int goal2 = 0;
        System.out.println("Output 2: " + solution.numSubarraysWithSum(nums2, goal2));  // Expected: 15
    }




}
