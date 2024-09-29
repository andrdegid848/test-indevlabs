package indevlabs;

public class Main {
    public static void main(String[] args) {

    }

    public static int findMissingNumberInArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is null or empty");
        } else if (nums.length == 1) {
            return nums[0] + 1;
        }

        int realSum = 0, waitedSum, missingNumber;
        int minValue = nums[0], maxValue = nums[0];

        for (int num : nums) {
            realSum += num;
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }
        waitedSum = (minValue + maxValue) * (maxValue - minValue + 1) / 2;
        missingNumber = waitedSum - realSum;

        if (missingNumber == 0) {
            return maxValue + 1;
        }

        return missingNumber;
    }
}
