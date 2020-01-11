import exercise.DistancePoint;
import exercise.Frequent;
import exercise.StringProblems;
import exercise.TwoDimensionalArrays;
import exercise.Unique;
import node.Node;
import tuple.Tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {


  public static void main(String[] args) {

    System.out.println(Unique.isUnique("Java"));
    System.out.println(Unique.isUnique("Josue"));

    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(3);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    Node.printAll(node1);

    Tuple<Integer, Integer> t1 = new Tuple<>(-1, -1);
    Tuple<Integer, Integer> t2 = new Tuple<>(200, 20);
    Tuple<Integer, Integer> t3 = new Tuple<>(800, 20);
    Tuple<Integer, Integer> t4 = new Tuple<>(100, 2);
    Tuple<Integer, Integer> t5 = new Tuple<>(45, 2);
    Tuple<Integer, Integer> t6 = new Tuple<>(79, 20);

    List<Tuple> inputTuple = new ArrayList<>();

    inputTuple.add(t1);
    inputTuple.add(t2);
    inputTuple.add(t3);
    inputTuple.add(t4);
    inputTuple.add(t5);
    inputTuple.add(t6);

    DistancePoint distancePoint = new DistancePoint();
    Tuple tuple = distancePoint.moreCloseToOrigin(inputTuple);
    System.out.println("The point X:" + tuple.x + " Y:" + tuple.y + " is the closest to origin");

    Frequent frequent = new Frequent();
    // NOTE: The following input values are used for testing your solution.

    // mostFrequent(array1) should return 1.
    int[] array1 = {1, 3, 1, 3, 2, 1};
    // mostFrequent(array2) should return 3.
    int[] array2 = {3, 3, 1, 3, 2, 1};
    // mostFrequent(array3) should return null.
    int[] array3 = {};
    // mostFrequent(array4) should return 0.
    int[] array4 = {0};
    // mostFrequent(array5) should return -1.
    int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

    int[] data = new int[] {1, 3, 11, 11};

    HashMap<Integer, Integer> result = frequent.mostFrequent(array5);
    System.out.println("Result --- >>> " + result);


    int[] array1A = {1, 3, 4, 6, 7, 9};
    int[] array2A = {1, 2, 4, 5, 9, 10};
    System.out.println("------ ------- >>> " + Arrays.toString(frequent.commonElements(array1A, array2A)));

    int[] array1B = {1, 2, 9, 10, 11, 12};
    int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
    System.out.println("------ ------- >>> " + Arrays.toString(frequent.commonElements(array1B, array2B)));

    int[] array1C = {0, 1, 2, 3, 4, 5, 9, 10, 20, 30, 40, 45, 56, 60};
    int[] array2C = {6, 7, 8, 9, 10, 11, 60};
    System.out.println("------ ------- >>> " + Arrays.toString(frequent.commonElements(array1C, array2C)));


    int[] array1a = {1, 2, 3, 4, 5, 6, 7};
    int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
    // isRotation(array1, array2a) should return false.
    System.out.println("iaRotation ----> " + frequent.isRotation(array1a, array2a));

    int[] array2b = {4, 5, 6, 7, 1, 2, 3};
    // isRotation(array1, array2b) should return true.
    System.out.println("iaRotation ----> " + frequent.isRotation(array1a, array2b));


    System.out.println("NON-REPETING ----> " + StringProblems.nonRepetingCharacter("abcab"));  // should return 'c'

    System.out.println("-------- One Way Strings -------");

    //System.out.println("Result for aaa and abc " + StringProblems.isOneWay("aaa","abc"));
    System.out.println("Result for abcde and abde " + StringProblems.isOneWay("abcde", "abde"));
    //System.out.println("Result for abc and abcde " + StringProblems.isOneWay("abc","abcde"));
    //System.out.println("Result for abc and abcde " + StringProblems.isOneWay("abc","abcde"));

    int[][] bombs1 = {{0, 2}, {2, 0}};
    System.out.println("Array --- " + TwoDimensionalArrays.mineSweeper(bombs1, 3, 3));
    // mineSweeper(bombs1, 3, 3) should return:
    // [[0, 1, -1],
    //  [1, 21, 1],
    //  [-1, 1, 0]]

    int a1[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    System.out.println("Rotate Array 90 degrees -> " + TwoDimensionalArrays.rotate(a1,3));

  }

}
