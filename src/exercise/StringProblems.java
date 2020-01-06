package exercise;


import java.util.HashMap;

public class StringProblems {

  /**
   * Implement a function that takes a string and returns the first character that soesnt not appear twice or more
   * <p>
   * Example:
   * - "abacc" -> b (a appears twice, and so does c)
   * - "xxyzx" -> y (y and z are non-repeting characters but y appears first)
   * If there is no non-repeting characters, return null
   *
   * @param s String
   * @return
   */
  public static Character nonRepetingCharacter(String s) {

    if (s.isEmpty()) {
      return null;
    }
    HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
    // NOTE: Using s.toCharArray() is no the most efficient method,
    // but I chose to use it here for simplicity.
    for (char c : s.toCharArray()) {
      if (charCount.containsKey(c)) {
        Integer newVal = charCount.get(c) + 1;
        charCount.put(c, newVal);
      } else {
        charCount.put(c, 1);
      }
    }
    for (char c : s.toCharArray()) {
      if (charCount.get(c) == 1) {
        return c;
      }
    }

    return null;
  }
}
