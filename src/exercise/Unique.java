package exercise;

import java.util.HashSet;
import java.util.Set;

public class Unique {

  /**
   * This method check is a string is unique or not.
   * For example this method needs a input like String
   * If this string contains any character more than once this String is not unique. In this cases
   * the method return false
   *
   * @param data a string to know if unique or not
   * @return a bool
   */
  public static boolean isUnique(String data) {
    Set<Character> set = new HashSet<>();

    // convert a String into array of characters
    char[] arrayString = data.toCharArray();

    // For each character into array save the current value into a set.
    // a set structure can't store repeated values
    for (Character current : arrayString) {
      if (!set.add(current)) {
        // return false because any character into string is not unique
        return false;
      }
    }
    // return true because all characters into string is unique
    return true;
  }

}
