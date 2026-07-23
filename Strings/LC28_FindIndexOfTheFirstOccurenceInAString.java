class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        // Loop through haystack
        for (int j = 0; j <= n - m; j++) {
            // Check substring of length m starting at j
            if (haystack.substring(j, j + m).equals(needle)) {
                return j; // Found match
            }
        }
        return -1; // Not found
    }
}