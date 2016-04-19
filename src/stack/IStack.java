package stack;

public interface IStack {
    public void insert(Node node);
    public Node find(int value);
    public boolean remove();
    public void clear();
}
