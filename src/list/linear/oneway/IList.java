package list.linear.oneway;

public interface IList {
	public void insertBegin(Node node);
	public void insertEnd(Node node);
	public void insertOrdered(Node node);
	public void showList();
	public void clearList();
	public boolean valueExists(int value);
}
