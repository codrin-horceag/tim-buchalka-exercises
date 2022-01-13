package AbstractClassChallenge;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(null);
        linkedList.addItem(new Node(1));
        linkedList.addItem(new Node(3));
        linkedList.addItem(new Node(2));
        linkedList.addItem(new Node(4));
        linkedList.addItem(new Node(5));
        linkedList.addItem(new Node(8));
        linkedList.addItem(new Node(6));
        linkedList.traverse(linkedList.getRoot());
    }
}
