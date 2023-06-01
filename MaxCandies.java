import java.util.HashSet;
public class MaxCandies {
	public static int maxCandies(int[] candyType) {
        // Calculate the maximum number of candies Alice can eat
        int maxEat = candyType.length / 2;

        // Use a HashSet to keep track of the unique candy types
        HashSet<Integer> uniqueCandies = new HashSet<>();

        // Iterate over the candy types and add them to the HashSet
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Return the minimum between the number of unique candies and the maximum number of candies Alice can eat
        return Math.min(uniqueCandies.size(), maxEat);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] candyType = {1, 1, 2, 2, 3, 3};
        int result = maxCandies(candyType);
        System.out.println("Maximum number of different types of candies Alice can eat: " + result);
	}

}
