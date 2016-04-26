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
        Node aux = top;
        while(aux!=null) {
            if(aux.getValue()==value) {
                return aux;
            } else {
               aux = aux.getNext();
            }
        }
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

    @Override
    public void list() {
        if (top==null) {
            System.out.println("Pilha vazia.");
        } else {
            Node aux = top;
            while (aux != null) {
                System.out.println(aux.getValue());
                aux = aux.getNext();
            }
        }
    }
}
