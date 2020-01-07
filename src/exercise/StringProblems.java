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


  /**
   * Write a function that takes two strings and returns true if they are from each other.
   * They are one way from each other if a single operation (changing a character, deleting a character or adding a character) will change one of
   * the strings to the other.
   * <p>
   * Examples:
   * - "abcde" and "abcd" are one away (deleting a character).
   * - "a" and "a" are one away (changing the only character 'a' to the equivalent character 'a').
   * - "abc" and "bcc" are not  one away. (They are two operations away.)
   *
   * @param s1
   * @param s2
   * @return
   */
  public static Boolean isOneWay(String s1, String s2) {

    // Comparo si la resta de la longuitud de ambos strings es >= 2 retorno false
    // ya que implica que no cumple con las condiciones de que los strings solo tengan una operacion simple
    // los que tienen la misma long no cumplen con la condicion
    if (s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2) {
      return false;
    } else if (s1.length() == s2.length()) {
      return isOneAwaySameLength(s1, s2);
    } else if (s1.length() > s2.length()) {
      return isOneAwayDiffLengths(s1, s2);
    } else {
      return isOneAwayDiffLengths(s2, s1);
    }
  }

  /**
   * Esto se va a ejecutar solo cuando los dos string contienen la misma cantidad de caracteres
   *
   * @param s1
   * @param s2
   * @return
   */
  public static Boolean isOneAwaySameLength(String s1, String s2) {
    int countDiff = 0;
    for (int i = 0; i < s1.length(); i++) {
      // valido caracater a caracter de ambos strings
      if (s1.charAt(i) != s2.charAt(i)) {
        countDiff += 1;
        // si la diferencia es mayor a uno es poque se realizaron mas de una operacion sobre los strings
        // es decir que solo se puede encontrar una sola diferencia
        if (countDiff > 1) {
          return false;
        }
      }
    }
    return true;
  }

  // Assumption: s1.length() == s2.length() + 1
  public static Boolean isOneAwayDiffLengths(String s1, String s2) {
    int i = 0;
    int countDiff = 0;
    while (i < s2.length()) {
      // Comparo caracter a caracter de ambos strings
      if (s1.charAt(i + countDiff) == s2.charAt(i)) {
        i += 1;
      } else {
        countDiff += 1;
      }
      if (countDiff > 1) {
        return false;
      }
    }
    return true;
  }

}
