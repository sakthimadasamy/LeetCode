class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] seen = new boolean[128];
            int count = 0;

            for (int j = i; j < s.length(); j++) {

                if (seen[s.charAt(j)]) {
                    break;
                }

                seen[s.charAt(j)] = true;
                count++;

                max = Math.max(max, count);
            }
        }

        return max;
    }
}