import exercise.Unique;
import node.Node;

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

  }

}
