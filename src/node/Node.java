package node;

public class Node {
  public Node next = null;
  public int data;

  public Node(int data){
    this.data = data;
  }

  public void appendToTail(int data) {
    Node end = new Node(data);
    Node current = this;
    if (current.next != null) {
      current = current.next;
    }
    current.next = end;
  }

  public void removeDuplicate(Node node) {

  }

  public static void printAll(Node node) {
    if (node.next != null) {
      System.out.print(node.data + " -> ");
      printAll(node.next);
    } else {
      System.out.print(node.data);
    }
  }
}
