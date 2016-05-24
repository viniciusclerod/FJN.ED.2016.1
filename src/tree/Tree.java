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
    public void listPreOrder() {
    	if(root == null) {
    		System.out.println("A árvore está vazia.");
    	} else {
    		preOrder(root);
    	}
    }

    @Override
    public void listOrder() {
    	if(root == null) {
    		System.out.println("A árvore está vazia.");
    	} else {
    		order(root);
    	}
    }

	@Override
    public void listPosOrder() {
		if(root == null) {
    		System.out.println("A árvore está vazia.");
    	} else {
    		posOrder(root);
    	}
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

    private void preOrder(Node parent) {
    	System.out.print(parent.getValue() + " ");
		if(parent.getLeft() != null)
			preOrder(parent.getLeft());
		if (parent.getRight() != null) 
			preOrder(parent.getRight());
	}
    
    private void order(Node parent) {
		if(parent.getLeft() != null)
			order(parent.getLeft());
		System.out.print(parent.getValue() + " ");
		if (parent.getRight() != null) 
			order(parent.getRight());
	}
    
    private void posOrder(Node parent) {
    	if(parent.getLeft() != null)
			posOrder(parent.getLeft());
		if (parent.getRight() != null) 
			posOrder(parent.getRight());
		System.out.print(parent.getValue() + " ");
	}
}
