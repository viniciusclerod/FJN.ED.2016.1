
public class List implements IList {
	
	private Node list = null;

	public void insertBegin(Node node) {
		if(list == null) {
			list = node;
		} else {
			node.setNext(list);
			list = node;
		}
	}

	public void insertEnd(Node node) {
		if (list == null) {
			list = node;
		} else {
			Node last = list;
			while(last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(node);
		}
	}

	public void insertOrdered(Node node) {
		if (list == null) {
			list = node;
		} else {
			if (list.getNext() == null) {
				if (list.getValue() > node.getValue()) {
					node.setNext(list);
					list = node;
				} else {
					list.setNext(node);
				}
			} else {
				if (list.getValue() > node.getValue()) {
					node.setNext(list);
					list = node;
				} else {
					Node aux = list;
					while (aux.getNext() != null) {
						if (aux.getNext().getValue() > node.getValue()) {
							node.setNext(aux.getNext());
							aux.setNext(node);
							break;
						} else {
							aux = aux.getNext();
							if (aux.getNext() == null) {
								aux.setNext(node);
								break;
							}
						}
					}
				}
			}
		}
	}
	
	public void showList() {
		System.out.print("list -> ");
		if (list != null) {
			Node aux = list;
			System.out.print(aux.getValue() + " -> ");
			while (aux.getNext() != null) {
				aux = aux.getNext();
				System.out.print(aux.getValue() + " -> ");
			}
		}
		System.out.println("null");
	}

	public void clearList() {
		list = null;
	}

	public boolean valueExists(int value) {
		if (list != null) {
			Node aux = list;
			while(aux.getNext() != null) {
				if (aux.getValue() == value) {
					return true;
				}
				aux = aux.getNext();
			}
			if (aux.getValue() == value) {
				return true;
			}
		}
		return false;
	}
}
