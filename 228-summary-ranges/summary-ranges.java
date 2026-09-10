class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int start = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] + 1 != nums[i + 1]) {

                if (start == nums[i]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i]);
                }

                start = nums[i + 1];
            }
        }

        // Add the last range
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }
}