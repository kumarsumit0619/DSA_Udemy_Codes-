package doubleLL;

public class Node {
	private int value;
	private Node next;
	private Node prev;
	
	public Node()
	{
		value = 0;
		next = null;
		prev = null;
	}
	
	//getters
	public int getValue()
	{
		return value;
	}

	public Node getNext()
	{
		return next;
	}
	
	public Node getPrev()
	{
		return prev;
	}
	
	//setters
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	public void setPrev(Node prev)
	{
		this.prev = prev;
	}
}
