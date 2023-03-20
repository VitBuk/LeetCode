package InterviewCourse.Level1;

public class Problem121 {
    public static int maxProfit(int[] prices) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < left) {
                left = price;
                right = Integer.MIN_VALUE;
            } else {
                if (price > right) {
                    right = price;

                    if (right - left > maxProfit) {
                        maxProfit = right - left;
                    }
                }
            }
        }

        return maxProfit;
    }
}
