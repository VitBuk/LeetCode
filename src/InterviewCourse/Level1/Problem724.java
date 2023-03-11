package InterviewCourse.Level1;

public class Problem724 {
    /*Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.*/

    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) return 0;

        for (int i=0; i<nums.length; i++) {
            int leftSum = 0;
            System.out.println("Number: " + nums[i]);
            System.out.println("Index: " + i);
            for (int j=0; j<i; j++) {
                leftSum+=nums[j];
                System.out.println("LeftSum: " + leftSum);
            }

            if (i==nums.length-1) {
                if (leftSum==0) return i;
                else return -1;
            }

            int rightSum = 0;
            for (int k=i+1; k<nums.length; k++) {
                rightSum+=nums[k];
                System.out.println("RightSum: " + rightSum);
            }

            if (leftSum == rightSum) return i;
        }

        return -1;
    }
}
