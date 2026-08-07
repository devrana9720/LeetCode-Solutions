class Solution {
    public int lengthOfLastWord(String s) {
    s = s.trim();
    int lastWord = s.lastIndexOf(" ");
    int length = s.length() - lastWord - 1;
    return length;
    }
}