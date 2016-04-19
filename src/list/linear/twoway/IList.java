package list.linear.twoway;

public interface IList {
	public void insertBegin(Node node);
	public void insertEnd(Node node);
	public void insertOrdered(Node node);
	public void showList();
	public void clearList();
	public void remove(int value);
	public boolean valueExists(int value);
}
