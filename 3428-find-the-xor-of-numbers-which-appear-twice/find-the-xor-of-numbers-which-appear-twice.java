class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                answer = answer ^ nums[i];
            } else {
                set.add(nums[i]);
            }
        }

        return answer;
    }
}