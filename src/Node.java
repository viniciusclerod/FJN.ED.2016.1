public class Node {
    private Node prev = null;
    private int value;
    private Node next = null;

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }

    public void setPrev(Node node) {
        this.prev = node;
    }
    public Node getPrev() {
        return this.prev;
    }

    public void setNext(Node node) {
        this.next = node;
    }
    public Node getNext() {
        return this.next;
    }
}
