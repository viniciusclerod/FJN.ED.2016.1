package list.linear.twoway;

public class List implements IList {

    private Node first = null;
    private Node last = null;

    @Override
    public void insertBegin(Node node) {
        if (first == null) {
            // A lista é vazia
            first = node;
            last = node;
        } else {
            // A lista não é vazia
            first.setPrev(node);
            node.setNext(first);
            first = node;
        }
    }

    @Override
    public void insertEnd(Node node) {
        if (last == null) {
            // A lista é vazia
            first = node;
            last = node;
        } else {
            last.setNext(node);
            node.setPrev(last);
            last = node;
        }
    }

    @Override
    public void insertOrdered(Node node) {
        if(first == null) {
            // se a lista é vazia
            first = node;
            last = node;
        } else {
            // se a lista não for vazia
            if (first == last) {
                // se houver apenas um nó
                if(node.getValue()<first.getValue()) {
                    // se o valor do novo nó for menor
                    this.insertBegin(node);
                } else {
                    this.insertEnd(node);
                }
            } else {
                // se houver mais de um nó na lista
                if(node.getValue()<first.getValue()) {
                    this.insertBegin(node);
                } else {
                    Node ant = first;
                    Node pos = first.getNext();
                    if (node.getValue()<pos.getValue()) {
                        ant.setNext(node);
                        node.setPrev(ant);
                        pos.setPrev(node);
                        node.setNext(pos);
                    } else {
                        while (pos.getNext()!=null) {
                            ant = ant.getNext();
                            pos = pos.getNext();
                            if (node.getValue()<pos.getValue()) {
                                ant.setNext(node);
                                node.setPrev(ant);
                                pos.setPrev(node);
                                node.setNext(pos);
                            }
                            if(pos == last) {
                                this.insertEnd(node);
                            }
                        }
                    }
                }

            }
        }
    }

    @Override
    public void showList() {
        System.out.print("first -> ");
        if (first == null) {
            System.out.println("null");
        } else {
            Node aux = first;
            System.out.print(aux.getValue());
            if (aux.getNext()!=null) System.out.print(" <-> ");
            while (aux.getNext() != null) {
                aux = aux.getNext();
                System.out.print(aux.getValue());
                if (aux.getNext()!=null) System.out.print(" <-> ");
            }
        }
        System.out.println(" <- last");
    }

    @Override
    public void clearList() {
        first = null;
        last = null;
    }

    @Override
    public void remove(int value) {
        if (first!=null) {
            if (first==last) {
                if (first.getValue()==value) {
                    first = null;
                    last = null;
                } else {
                    // Não encontrado
                }
            } else {
                Node aux = first;
                while (aux!=last) {
                    aux = aux.getNext();
                    if (aux.getValue()==value) {
                        if (aux==first) {
                            first = aux.getNext();
                        } else {
                            aux.getPrev().setNext(aux.getNext());
                        }
                        if (aux==last) {
                            last = aux.getPrev();
                        } else {
                            aux.getNext().setPrev(aux.getPrev());
                        }
                        aux.setPrev(null);
                        aux.setNext(null);
                        break;
                    }
                }
            }
        } else {
            // Lista vazia
        }
    }

    @Override
    public boolean valueExists(int value) {
        return false;
    }
}
