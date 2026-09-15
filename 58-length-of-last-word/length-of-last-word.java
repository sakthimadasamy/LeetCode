class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String w=str[str.length-1];
        int count=0;
        for(int i=0;i<w.length();i++)
        {
            count++;
        }
        return count;
        
    }
}