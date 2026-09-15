class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";

while (columnNumber > 0) {
    columnNumber--;

    int rem = columnNumber % 26;

    result = (char)('A' + rem) + result;

    columnNumber = columnNumber / 26;
}

return result;
    }
}