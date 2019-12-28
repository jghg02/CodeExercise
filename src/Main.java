import exercise.DistancePoint;
import exercise.Unique;
import node.Node;
import tuple.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

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
  }

}
