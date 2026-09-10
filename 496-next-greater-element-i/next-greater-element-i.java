class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean found = false;

                    for (int k = j + 1; k < nums2.length; k++) {

                        if (nums2[k] > nums1[i]) {
                            result.add(nums2[k]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        result.add(-1);
                    }

                    break;
                }
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}