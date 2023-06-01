import java.util.Arrays;
public class ArrayPairSum {
	public static int arrayPairSum(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // Take the minimum value of each pair and add it to the sum
            sum += nums[i];
        }

        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 4, 3, 2};
        int result = arrayPairSum(nums);
        System.out.println("Maximized sum: " + result);

	}

}
