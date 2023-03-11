package InterviewCourse.Level1;

public class Problem1480 {
    public static int[] runningSum(int[] nums) {
        if (nums.length < 2)
            return nums;

        int[] resultNums = new int[nums.length];
        resultNums[0] = nums[0];

            for (int i=1; i<nums.length; i++ ) {
                resultNums[i] = resultNums[i-1] + nums[i];
            }

            return resultNums;
    }
}
