class Solution {
    public char findTheDifference(String s, String t) {

        for (int i = 0; i < t.length(); i++) {

            int countS = 0;
            int countT = 0;

            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    countS++;
                }
            }

            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(i) == t.charAt(j)) {
                    countT++;
                }
            }

            if (countT > countS) {
                return t.charAt(i);
            }
        }

        return ' ';
    }
}