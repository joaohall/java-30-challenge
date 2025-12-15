import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Problem1768 {
    /**
     * Merge two strings by adding letters in alternating order, starting with word1.
     * If a string is longer than the other, append the additional letters to the end.
     *
     * @param word1 First string
     * @param word2 Second string
     * @return Merged string with alternating characters
     * <p>
     * Example 1:
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * <p>
     * Example 2:
     * Input: word1 = "ab", word2 = "pqrs"
     * Output: "apbqrs"
     * <p>
     * Example 3:
     * Input: word1 = "abcd", word2 = "pq"
     * Output: "apbqcd"
     * <p>
     * Constraints:
     * 1 <= word1.length, word2.length <= 100
     * word1 and word2 consist of lowercase English letters.
     */
    public String stringMerge(String word1, String word2) {
        int counter = word1.length() + word2.length(); // 6
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            if (word1.length() > i) {
                result.add(word1.charAt(i)); // resultado = a
            }
            if(word2.length() > i){
                result.add(word2.charAt(i)); // resultado = a,
            }
        }
        return result.stream().map(String::valueOf).collect(Collectors.joining());
    }
}

