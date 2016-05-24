package tree;

public interface ITree {

    public void push(Node node);
    public boolean pop(int value);
    public void listPreOrder();
    public void listOrder();
    public void listPosOrder();

}
