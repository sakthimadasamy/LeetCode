class Solution {
    public int subtractProductAndSum(int n) {
        String s=String.valueOf(n);
        int mul=1;
        int add=0;
        for(int i=0;i<s.length();i++)
        {
            mul*=s.charAt(i)-'0';
            add+=s.charAt(i)-'0';

        }
        int fin = mul-add;
        return fin;
    }
}