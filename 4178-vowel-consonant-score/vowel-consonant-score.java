class Solution {
    public int vowelConsonantScore(String s) {
        int vow=0,con=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' ||s.charAt(i)== 'e' ||s.charAt(i)== 'i' || s.charAt(i)=='o' ||s.charAt(i)== 'u')
            {
                vow++;
            }
            else if(Character.isLetter(s.charAt(i)))
            {
                con++;
            }
        }
        int ans=0;
        if(con!=0)
        {
         ans=vow/con;
        }
        return ans;
    }
}