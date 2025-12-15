public class Problem1071 {
    /**
     * For two strings s and t, we say "t divides s" if and only if
     * s = t + t + t + ... + t + t (i.e., t is concatenated with itself
     * one or more times).
     *
     * Given two strings str1 and str2, return the largest string x
     * such that x divides both str1 and str2.
     *
     * @param str1 First string
     * @param str2 Second string
     * @return The largest string that divides both str1 and str2,
     *         or empty string if no such string exists
     *
     * @example
     * // Example 1:
     * // Input: str1 = "ABCABC", str2 = "ABC"
     * // Output: "ABC"
     * // Explanation: Both strings can be divided by "ABC"
     *
     * @example
     * // Example 2:
     * // Input: str1 = "ABABAB", str2 = "ABAB"
     * // Output: "AB"
     * // Explanation:
     * // str1 = "AB" + "AB" + "AB"
     * // str2 = "AB" + "AB"
     * // Common divisor: "AB"
     *
     * @example
     * // Example 3:
     * // Input: str1 = "LEET", str2 = "CODE"
     * // Output: ""
     * // Explanation: No common divisor exists
     *
     * @example
     * // Example 4:
     * // Input: str1 = "AAAAAB", str2 = "AAA"
     * // Output: ""
     * // Explanation: No common divisor exists
     *
     * @constraints
     * - 1 <= str1.length, str2.length <= 1000
     * - str1 and str2 consist of English uppercase letters
     */

    public String gcdOfStrings(String arg1, String arg2){
        return arg1 + arg2;
    }
}
