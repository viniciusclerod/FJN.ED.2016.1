package tree;

public interface ITree {

    public void push(Node node);
    public boolean pop(int value);
    public void preOrder();
    public void order();
    public void posOrder();

}
