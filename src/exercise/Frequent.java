package exercise;

import java.util.Dictionary;
import java.util.HashMap;

public class Frequent {
  public HashMap<Integer, Integer> mostFrequent(int[] data) {

    // Put all values into array with your numbers of occurents
    HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
    int max = -1;
    Integer max_value = null;

    // eval each value into array
    for (int i = 0; i < data.length; i++) {
      // check if into Dictionary has a current value in array
      if (result.containsKey(data[i])) {
        // if value exist put into dictionary and sum the value plus one
        int newValue = result.get(data[i]) + 1;
        result.put(data[i], newValue);
      } else {
        // if value no exist put the value of array and one (because is this value doesn't exist into dictionary)
        result.put(data[i], 1);
      }

      // check the value for each key (val for each integer into array) if grater of max
      if (result.get(data[i]) > max) {
        // replace the actual value of max for the value to get of the dictionary
        max = result.get(data[i]);
        // get the key
        max_value = data[i];
      }
    }

    System.out.println("MAX_VALUE " + max_value);
    return result;
  }

}
