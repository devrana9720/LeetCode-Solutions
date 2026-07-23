class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int o = haystack.length();
        int p = needle.length();

        // Loop through haystack
        for (int i = 0; i <= o - p; i++) {
            // Check substring of length m starting at i
            if (haystack.substring(i, i + p).equals(needle)) {
                return i; // Found match
            }
        }
        return -1; // Not found
    }
}