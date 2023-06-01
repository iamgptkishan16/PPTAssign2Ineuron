import java.util.HashMap;
import java.util.Map;
public class LongestHarmoniousSubSequence {
	public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each number
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int longestSubsequence = 0;
        
        // Check each number and its adjacent numbers to find the longest harmonious subsequence
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(num + 1)) {
                int currentSubsequence = frequencyMap.get(num) + frequencyMap.get(num + 1);
                longestSubsequence = Math.max(longestSubsequence, currentSubsequence);
            }
        }
        
        return longestSubsequence;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        LongestHarmoniousSubSequence solution = new LongestHarmoniousSubSequence();
        int longestSubsequence = solution.findLHS(nums);
        System.out.println("The length of the longest harmonious subsequence is: " + longestSubsequence);

	}

}
