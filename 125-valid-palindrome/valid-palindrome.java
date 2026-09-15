class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        String f=s.toLowerCase();
        if(s.equals(" "))
        {
            return true;
        }
        for(int i=0;i<f.length();i++)
        {
            if(Character.isLetterOrDigit(f.charAt(i)))
            {
                 str+=f.charAt(i);
            }
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
              rev+=str.charAt(i);
        }
        if(!rev.equals(str))
        {
            return false;
        }
        return true;
    }
}