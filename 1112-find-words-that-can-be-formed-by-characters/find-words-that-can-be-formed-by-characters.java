class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String ch = words[i];
            boolean[] used = new boolean[chars.length()];
            boolean valid = true;

            for (int j = 0; j < ch.length(); j++) {
                boolean found = false;

                for (int k = 0; k < chars.length(); k++) {
                    if (ch.charAt(j) == chars.charAt(k)
                        && !used[k]) {
                        used[k] = true;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                count += ch.length();
            }
        }
        return count;
    }
}
