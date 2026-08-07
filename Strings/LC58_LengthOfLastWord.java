class Solution {
    public int lengthOfLastWord(String s) {
    s = s.trim();
    int lastWord = s.lastIndexOf(" ");
    return s.length() - lastWord - 1;
    }
}