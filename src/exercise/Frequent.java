package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

  // Write a function that returns the common elements (as an array) between two sorted arrays of integers (ascending order)
  // Example: The common elements between [1,2,3,5,6,7] and [1,3,7,8,9] are [1,3,7]
  public Integer[] commonElements(int[] array1, int[] array2) {

    List<Integer> commonValues = new ArrayList<Integer>();


    for (int x = 0; x < array1.length; x++) {
      for (int y = 0; y < array2.length; y++) {
        if (array1[x] == array2[y]) {
          commonValues.add(array1[x]);
        }
      }
    }

    Integer[] resultInArray = new Integer[commonValues.size()];
    resultInArray = commonValues.toArray(resultInArray);

    //return commonValues.stream().mapToInt(Integer::intValue).toArray();
    return resultInArray;
  }

  // Write a function that retursn ture if one array is a rotation of another
  // NOTE: There are no duplicates in each of these arrays
  // Example: [1,2,3,4,5,6,7] is a rotation of [4,5,6,7,1,2,3]
  // contains the same elements in the same order but they start at different indices
  public Boolean isRotation(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }

    int firstElement = array1[0];
    int key_index = -1;

    for (int x = 0; x < array2.length; x++) {
      if (array2[x] == firstElement) {
        // save the index to the first element
        key_index = x;
        break;
      }
    }

    // after the loop of array2 the value of key_index is equal to -1
    // that means we didn't find the key in array2
    if (key_index == -1) {
      return false;
    }

    for (int y = 0; y < array1.length; y++) {
      int t = (key_index + y) % array1.length;
      if (array1[y] != array2[t]) {
        return false;
      }
    }

    return true;
  }

}
