package stack;

public class Stack implements IStack {
    protected Node top = null;

    @Override
    public void insert(Node node) {
        node.setNext(top);
        top = node;
    }

    @Override
    public Node find(int value) {
        return null;
    }

    @Override
    public boolean remove() {
        if (top != null) {
            top = top.getNext();
            return true;
        } else return false;
    }

    @Override
    public void clear() {
        top = null;
    }
}
