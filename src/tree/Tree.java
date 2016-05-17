package tree;

public class Tree implements ITree {

    private Node root = null;

    @Override
    public void push(Node node) {
        if(root == null) {
            root = node;
        } else {
            insert(root, node);
        }
    }

    @Override
    public boolean pop(int value) {
        if(root==null) {
            return false;
        } else {
            return remove(root, value);
        }
    }

    @Override
    public void preOrder() {

    }

    @Override
    public void order() {

    }

    @Override
    public void posOrder() {

    }

    private void insert(Node parent, Node node) {
        if (node.getValue() > parent.getValue()) {
            if (parent.getRight() == null) {
                parent.setRight(node);
            } else {
                insert(parent.getRight(), node);
            }
        } else {
            if (parent.getLeft() == null) {
                parent.setLeft(node);
            } else {
                insert(parent.getLeft(), node);
            }
        }
    }

    private boolean remove(Node parent, int value) {
        if (parent.getValue() ==  value) {
            if (parent.getRight()==null) {
                parent.setRight(null);
            } else {
                parent.setRight(parent.getRight().getRight());
            }
            return true;
        } else {
            if(parent.getValue() < value) {
                if(parent.getRight() == null) return false;
                return remove(parent.getRight(), value);
            } else {
                if(parent.getLeft() == null) return false;
                return remove(parent.getLeft(), value);
            }
        }
    }
}
